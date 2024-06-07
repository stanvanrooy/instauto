# Changelog

## 2.1.0

### Fixes

* remove usage of (deprecated?) csrf token
* increase default ig version, previous is deprecated
* typings for instagram posts
* handle retrieve_story for accounts with no active stories

**Full Changelog**: https://github.com/stanvanrooy/instauto/compare/2.0.7...2.1.0

## 2.0.7 (2022-04-30)

* Create unfollow_user by @ItsFlorkast in https://github.com/stanvanrooy/instauto/pull/205
* feat: add error message to generic bad response exception by @stanvanrooy in https://github.com/stanvanrooy/instauto/pull/206
* save & load from/to json by @hiaselhans in https://github.com/stanvanrooy/instauto/pull/207
* chore(deps): bump babel from 2.8.0 to 2.9.1 by @dependabot in https://github.com/stanvanrooy/instauto/pull/211

**Full Changelog**: https://github.com/stanvanrooy/instauto/compare/2.0.5...2.0.7

## 2.0.6 (2021-08-28)

#### New Features

* add error message to generic bad response exception ([#206](https://github.com/stanvanrooy/instauto/issues/206))

Full set of changes: [`2.0.5...2.0.6`](https://github.com/stanvanrooy/instauto/compare/2.0.5...2.0.6)

## 2.0.5 (2021-08-12)

#### Fixes 

* use property instead of __getitem__ ([#202](https://github.com/stanvanrooy/instauto/issues/202))

Full set of changes: [`2.0.4...2.0.5`](https://github.com/stanvanrooy/instauto/compare/2.0.3...2.0.5)

## 2.0.4 (2021-08-07)

#### Fixes 
* use `dict.get` instead of key index

Full set of changes: [`2.0.3...2.0.4`](https://github.com/stanvanrooy/instauto/compare/2.0.3...2.0.4)


## 2.0.3 (2021-08-02)

#### New Features

* retrieve stories from a user
#### Docs

* add examples for retrieving stories
* add javad94 as a contributor for code ([#197](https://github.com/stanvanrooy/instauto/issues/197))
* fixed documentation link ([#195](https://github.com/stanvanrooy/instauto/issues/195))

Full set of changes: [`2.0.2...2.0.3`](https://github.com/stanvanrooy/instauto/compare/2.0.2...2.0.3)

## 2.0.2 (2021-07-29)

#### Fixes

* client.unfollow_user -> client.user_unfollow ([#191](https://github.com/stanvanrooy/instauto/issues/191))
* change order of parameters ([#192](https://github.com/stanvanrooy/instauto/issues/192))
#### Docs

* update readme

Full set of changes: [`2.0.1...2.0.2`](https://github.com/stanvanrooy/instauto/compare/2.0.1...2.0.2)

## 2.0.1 (2021-07-28)

#### New Features

* support both `user_id` and `username` as arguments in helper functions
* add  helper function
* use structured models for helper functions
* retrieve recent activity
* retrieve post by id
* retrieve posts from your feed
* update instagram profile picture
#### Fixes

* use correct order for arguments
* (profile): do not set biography to an empty string when updating profile
* (examples): don't set a caption for null post :)
* (friendships): return False, when there are no more user accounts to retrieve
* (examples): use ctor, instead of .create
* (examples): use valid user id
* (examples): use ctor, instead of .Create
* (post): we should probably include the next max id
* (examples): use  instead of , when updating profile picture
* (profile): add missing obj.fill calls
* (profile): always send (empty)  parameter when updating gender.
#### Docs

* wasn't a typo
* fix typo
* add alperenkaplan as a contributor for code, doc ([#183](https://github.com/stanvanrooy/instauto/issues/183))
* add Fislix as a contributor ([#175](https://github.com/stanvanrooy/instauto/issues/175))
* update readme
* add examples for the helper functions
* add examples for search actions
* add examples for profile actions
* add examples for post actions
* add examples for friendship actions
* add examples for feed actions
* add examples for direct actions
* add examples for authentication actions
* add examples for activity actions
* update readme
* update readme
* add atnartur as a contributor ([#171](https://github.com/stanvanrooy/instauto/issues/171))
* fix code example in usage section in readme ([#170](https://github.com/stanvanrooy/instauto/issues/170))
* update/add examples
#### Others

* (deps): bump urllib3 from 1.25.9 to 1.26.5 ([#179](https://github.com/stanvanrooy/instauto/issues/179))
* update contributor count
* add example for retrieving your feed
* update readme
* update .gitignore
* rewrite
* (deps): bump pygments from 2.6.1 to 2.7.4 ([#152](https://github.com/stanvanrooy/instauto/issues/152))
* (deps): bump jinja2 from 2.11.2 to 2.11.3 ([#151](https://github.com/stanvanrooy/instauto/issues/151))
* delete 'ready' folder

Full set of changes: [`1.0.6...2.0.1`](https://github.com/stanvanrooy/instauto/compare/1.0.6...2.0.1)

## 1.0.6 (2021-02-17)

#### New Features

* 143 two factor authentication ([#144](https://github.com/stanvanrooy/instauto/issues/144))
* 128 refresh pigeon session ([#141](https://github.com/stanvanrooy/instauto/issues/141))
* do not log authorization header ([#140](https://github.com/stanvanrooy/instauto/issues/140))
#### Fixes

* null check
#### Docs

* add tibotix as a contributor ([#138](https://github.com/stanvanrooy/instauto/issues/138))
* add ItsFlorkast as a contributor ([#137](https://github.com/stanvanrooy/instauto/issues/137))
* add tibotix as a contributor ([#132](https://github.com/stanvanrooy/instauto/issues/132))
#### Others

* setup for release 1.0.6
* update import

Full set of changes: [`1.0.5...1.0.6`](https://github.com/stanvanrooy/instauto/compare/1.0.5...1.0.6)

## 1.0.5 (2020-12-16)

#### Fixes

* use a bit more random upload id
#### Docs

* add stanvanrooy as a contributor ([#129](https://github.com/stanvanrooy/instauto/issues/129))
#### Others

* update for release 1.0.5
* update docs

Full set of changes: [`1.0.4...1.0.5`](https://github.com/stanvanrooy/instauto/compare/1.0.4...1.0.5)

## 1.0.4 (2020-12-10)

#### New Features

* upload carousels
* change password
* track limitations
#### Fixes

* use same device id everywhere
* ensure unique csrftoken cookie
* remove trailing comma
* typo
#### Docs

* add example for changing password
* update
#### Others

* update typo
* prepare for release 1.0.4

Full set of changes: [`1.0.3...1.0.4`](https://github.com/stanvanrooy/instauto/compare/1.0.3...1.0.4)

## 1.0.3 (2020-12-08)

#### New Features

* add tagging users in posts.
* implement bot for automating tasks on instagram
#### Fixes

* actually call start scheduler
* _session_id doesn't exist
#### Docs

* add docs
* show example of how to use bot in readme
* add documentation comments
* add returnWOW as a contributor ([#115](https://github.com/stanvanrooy/instauto/issues/115))
#### Others

* prepare for release 1.0.3
* update coverage badge. this should be done automatically :)
* use DirectTHread
* add example for just retrieving your inbox
* update example
* update issue templates
* cleanup
* add/update tests for authentication
* add tests for helper functions
* update tests for direct messaging

Full set of changes: [`1.0.2...1.0.3`](https://github.com/stanvanrooy/instauto/compare/1.0.2...1.0.3)

## 1.0.2 (2020-12-02)

#### New Features

* add direct message functionality
#### Docs

* add b177y as a contributor ([#114](https://github.com/stanvanrooy/instauto/issues/114))
#### Others

* update for V1.0.2
* update for V1.0.2
* fix formatting
* update
* back to `pip install instauto`

Full set of changes: [`1.0.1...1.0.2`](https://github.com/stanvanrooy/instauto/compare/1.0.1...1.0.2)

## 1.0.1 (2020-11-23)

#### New Features

* add already made functionality for automating behaviour on Instagram
* add various other helper functions
* throw custom exception for Instagram unauthorized errors
#### Fixes

* typos in ready made functions
* always send `user_id` as string to instagram
* add obj to for retrieving commenters and likers
#### Docs

* fix example for ready made function
* add gocnik95 as a contributor ([#103](https://github.com/stanvanrooy/instauto/issues/103))
* add juhas96 as a contributor ([#104](https://github.com/stanvanrooy/instauto/issues/104))
* add Samu1808 as a contributor ([#105](https://github.com/stanvanrooy/instauto/issues/105))
* add kevinjon27 as a contributor ([#106](https://github.com/stanvanrooy/instauto/issues/106))
* add marvic2409 as a contributor ([#107](https://github.com/stanvanrooy/instauto/issues/107))
* add marosgonda as a contributor ([#102](https://github.com/stanvanrooy/instauto/issues/102))
#### Others

* update changelog
* update for V1.0.1
* setup for release 1.0.0
* actually fix formatting
* fix formatting
* update all contributors badge [skip ci]
* fix tests
* fix contributors test
* create test_post.py

Full set of changes: [`0.0.18...1.0.1`](https://github.com/stanvanrooy/instauto/compare/0.0.18...1.0.1)

## 0.0.18 (2020-11-17)

#### New Features

* add helper methods for (almost?) all actions. ([#101](https://github.com/stanvanrooy/instauto/issues/101))
* retrieve posts by tag(s)
* get commenters of post
* get likers of media
* upload images to story ([#86](https://github.com/stanvanrooy/instauto/issues/86))
#### Fixes

* KeyError if challenge was requested during login ([#100](https://github.com/stanvanrooy/instauto/issues/100))
* `Surface` is not JSON serializable
* `post_retrieve_by_user`
* typo
* make `feed_position` optional
#### Docs

* update comment_post.py ([#81](https://github.com/stanvanrooy/instauto/issues/81))
* update like_post.py ([#80](https://github.com/stanvanrooy/instauto/issues/80))
#### Others

* update gitignore

Full set of changes: [`0.0.17...0.0.18`](https://github.com/stanvanrooy/instauto/compare/0.0.17...0.0.18)

## 0.0.17 (2020-10-14)

#### Fixes

* add device details to upload image request ([#78](https://github.com/stanvanrooy/instauto/issues/78))
* remove python3.8 feature ([#77](https://github.com/stanvanrooy/instauto/issues/77))
#### Others

* (release): 0.0.17

Full set of changes: [`0.0.16...0.0.17`](https://github.com/stanvanrooy/instauto/compare/0.0.16...0.0.17)

## 0.0.16 (2020-10-07)

#### New Features

* handle verification challenges
* add pprint to __repr__
#### Fixes

* imports, usages of new structs.
* give kwargs priority over defaults
#### Refactorings

* lower case naming for mixins
* profile structs
* search structs
* post structs. fix: only allow jpg images, closes [#68](https://github.com/stanvanrooy/instauto/issues/68). related [#65](https://github.com/stanvanrooy/instauto/issues/65)
* friendship structs ([#66](https://github.com/stanvanrooy/instauto/issues/66))
* friendship structs
#### Docs

* setting up a dev env.
* add example for updating the caption of a post
#### Others

* (release): 0.0.16

Full set of changes: [`0.0.15...0.0.16`](https://github.com/stanvanrooy/instauto/compare/0.0.15...0.0.16)

## 0.0.15 (2020-09-23)

#### Fixes

* errors in GetFollowing/GetFollowers ([#57](https://github.com/stanvanrooy/instauto/issues/57))
#### Others

* add for the authentication action ([#59](https://github.com/stanvanrooy/instauto/issues/59))

Full set of changes: [`0.0.14...0.0.15`](https://github.com/stanvanrooy/instauto/compare/0.0.14...0.0.15)

## 0.0.14 (2020-09-23)


Full set of changes: [`0.0.13...0.0.14`](https://github.com/stanvanrooy/instauto/compare/0.0.13...0.0.14)

## 0.0.13 (2020-09-19)

#### Fixes

* update return signature of `profile_info`
* incorrect key in `profile_info`
* sending location data along with upload request
* add example to post image with location data

Full set of changes: [`0.0.12...0.0.13`](https://github.com/stanvanrooy/instauto/compare/0.0.12...0.0.13)

## 0.0.12 (2020-09-05)

#### Fixes

* temporarily disable testing
#### Refactorings

* Rename Show(Following|Followers). Closes [#29](https://github.com/stanvanrooy/instauto/issues/29)

Full set of changes: [`0.0.11...0.0.12`](https://github.com/stanvanrooy/instauto/compare/0.0.11...0.0.12)

## 0.0.11 (2020-08-02)


Full set of changes: [`0.0.10...0.0.11`](https://github.com/stanvanrooy/instauto/compare/0.0.10...0.0.11)

## 0.0.10 (2020-07-29)


Full set of changes: [`0.0.8...0.0.10`](https://github.com/stanvanrooy/instauto/compare/0.0.8...0.0.10)

## 0.0.8 (2020-07-29)


Full set of changes: [`0.0.9...0.0.8`](https://github.com/stanvanrooy/instauto/compare/0.0.9...0.0.8)

## 0.0.9 (2020-07-29)


Full set of changes: [`0.0.7...0.0.9`](https://github.com/stanvanrooy/instauto/compare/0.0.7...0.0.9)

## 0.0.7 (2020-07-26)


Full set of changes: [`0.0.6...0.0.7`](https://github.com/stanvanrooy/instauto/compare/0.0.6...0.0.7)

## 0.0.6 (2020-07-26)


Full set of changes: [`0.0.4, 0.0.5...0.0.6`](https://github.com/stanvanrooy/instauto/compare/0.0.4, 0.0.5...0.0.6)

## 0.0.4, 0.0.5 (2020-07-26)


Full set of changes: [`0.0.3...0.0.4, 0.0.5`](https://github.com/stanvanrooy/instauto/compare/0.0.3...0.0.4, 0.0.5)

## 0.0.3 (2020-07-26)


Full set of changes: [`0.0.1...0.0.3`](https://github.com/stanvanrooy/instauto/compare/0.0.1...0.0.3)

## 0.0.1 (2020-07-26)

