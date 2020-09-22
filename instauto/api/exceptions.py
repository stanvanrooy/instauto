class StateExpired(Exception):
    """Raised when saved settings are provided, but not valid anymore"""
    pass


class NoAuthDetailsProvided(Exception):
    """Raised when the login details are not provided, but the client needs them"""
    pass


class WrongMethodException(Exception):
    """Raised when (presumable) the wrong method is used for a request."""
    pass


class IncorrectLoginDetails(Exception):
    """Raised when the provided loging details are incorrect."""
    pass


class InvalidUserId(Exception):
    """Raised when an invalid user id is provided"""
    pass


class CorruptedSaveData(Exception):
    """Raised when the save data can't be read"""
    pass


class BadResponse(Exception):
    """Raised when Instagram returns a non-ok status code."""
    pass


class MissingValue(Exception):
    """Raised when an action struct is initiated with a missing value"""
    pass
