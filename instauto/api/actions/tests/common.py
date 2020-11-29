import os
import json


def helper(s, test_case):
    actual = s.to_dict()
    path = f'original_requests/{s.REQUEST}'
    # make sure the tests can be both run from the root dir, and the test directory.
    if os.path.isdir('../../../original_requests/'):
        path = '../../../' + path

    with open(path, 'r') as f:
        expected = json.load(f)

    for k in actual.keys():
        test_case.assertIn(k, expected['request'])

    for k in expected['request'].keys():
        if isinstance(expected['request'][k], dict):
            if not expected['request'][k].get("on_all_requests", True):
                continue
        test_case.assertIn(k, actual)
