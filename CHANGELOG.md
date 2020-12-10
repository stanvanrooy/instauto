# Changelog

All notable changes to this project will be documented in this file.


### 1.0.4 (2020-12-10)

### Features

* upload carousels ([1f36d65](https://github.com/stanvanrooy/instauto/commit/1f36d65c180cde44f2f865a520da742969d28798))
* change password ([db97b25](https://github.com/stanvanrooy/instauto/commit/db97b2563af69a0dcfeb7aabdfa5ca6f4193923f))
* track limitations ([b82d014](https://github.com/stanvanrooy/instauto/commit/b82d01467ec6b1e03b1e73e0369cc49055bded98))

### Bugfixes
* use same device id everywhere ([908335c](https://github.com/stanvanrooy/instauto/commit/b82d01467ec6b1e03b1e73e0369cc49055bded98))
* several other minor bugfixes


### 1.0.3 (2020-12-8)

### Features

* add tagging users in posts ([e0a4057](https://github.com/stanvanrooy/instauto/commit/e0a40578c0e92ee1b6d28554d448187687802b13))
* implement bot for automating tasks on Instagram ([a6fbbd6](https://github.com/stanvanrooy/instauto/commit/a6fbbd671e79c51d3e394ecbfd19be037e3ca230))

### Bug fixes

* actually call start scheduler ([c2fec6e](https://github.com/stanvanrooy/instauto/commit/c2fec6ec43f8cc383ea58dedef9cd08b704c1f37))
* session_Id doesn't exist ([cf6bd5a](https://github.com/stanvanrooy/instauto/commit/cf6bd5a2c8ab5865feace9becece8ac1bb361030))
* fix this was me challenge ([d0852d5](https://github.com/stanvanrooy/instauto/commit/d0852d5b1e058c05395b7daf28594944e8646ed9))

### 1.0.2 (2020-12-2)
* add direct message functionality ([2683ce8](https://github.com/stanvanrooy/instauto/commit/2683ce806a36e515052dbb16af4b97e75daa2e1b))

### 1.0.1 (2020-11-23)

### Bug Fixes

* typos in ready made functions ([a033204](https://github.com/stanvanrooy/instauto/commit/a033204ad781243630e7b487aa308d5ef9761ea9))
### 1.0.0 (2020-11-21)


### Features

* add already made functionality for automating behaviour on Instagram ([2be2146](https://github.com/stanvanrooy/instauto/commit/2be2146e8996351212b99d27dc5740ae505849bb))
* add various other helper functions ([1a98274](https://github.com/stanvanrooy/instauto/commit/1a9827441f569c556923f751f886dc92a241e54b))

### Bug Fixes

* add obj to for retrieving commenters and likers ([8ed8d9b](https://github.com/stanvanrooy/instauto/commit/8ed8d9b0b67723cde71103675aa832c96741b979))
* always send `user_id` as string to instagram ([6cb731a](https://github.com/stanvanrooy/instauto/commit/6cb731a854581b72fe60a11bbeaf01c191d6d6b1))

### 0.0.18 (2020-11-16)


### Features

* add helper methods for (almost?) all actions. ([4fb9e36](https://github.com/stanvanrooy/instauto/commit/4fb9e3613dd26b0e287ca9486b837904425f1012)), closes [#23](https://github.com/stanvanrooy/instauto/issues/23) [#26](https://github.com/stanvanrooy/instauto/issues/26)
* get commenters of post ([c39a220](https://github.com/stanvanrooy/instauto/commit/c39a2203016e3cd7c590d24c1fe3ac088fe9e878))
* get likers of media ([5b91801](https://github.com/stanvanrooy/instauto/commit/5b91801032374198b1c69d8eaf3be89162a79492)), closes [#93](https://github.com/stanvanrooy/instauto/issues/93)
* retrieve posts by tag(s) ([5f089eb](https://github.com/stanvanrooy/instauto/commit/5f089eb1d48e1e27fc5a9f967d2b65c85faeb13d))
* upload images to story ([#86](https://github.com/stanvanrooy/instauto/issues/86)) ([c964f7d](https://github.com/stanvanrooy/instauto/commit/c964f7db61bdff1d6e3c4eab0270162d98770016)), closes [#50](https://github.com/stanvanrooy/instauto/issues/50)


### Bug Fixes

* `post_retrieve_by_user` ([32661d3](https://github.com/stanvanrooy/instauto/commit/32661d323ea983b7c39ef9b1667a977b851bbcb5))
* `Surface` is not JSON serializable ([d3f5d28](https://github.com/stanvanrooy/instauto/commit/d3f5d28aaade2a1db72d5be7c39c93a256f68814)), closes [#97](https://github.com/stanvanrooy/instauto/issues/97)
* add example to post image with location data ([f06cc6b](https://github.com/stanvanrooy/instauto/commit/f06cc6bd0c6ea69663afea8497352f55235ccdff))
* KeyError if challenge was requested during login ([#100](https://github.com/stanvanrooy/instauto/issues/100)) ([c3b01d1](https://github.com/stanvanrooy/instauto/commit/c3b01d17bcedb93c0f4cb2f9711083b34b8e13fa)), closes [#90](https://github.com/stanvanrooy/instauto/issues/90)
* make `feed_position` optional ([4be29b3](https://github.com/stanvanrooy/instauto/commit/4be29b3b3cbea462a71e5f9ec50d0f0f199581d0)), closes [#79](https://github.com/stanvanrooy/instauto/issues/79)
* typo ([fc647e3](https://github.com/stanvanrooy/instauto/commit/fc647e3bfc750d9806b1b384e1ab5ef5b5911c41))

### 0.0.17 (2020-10-14)


### Bug Fixes

* add device details to upload image request ([#78](https://github.com/stanvanrooy/instauto/issues/78)) ([19d65cb](https://github.com/stanvanrooy/instauto/commit/19d65cb2a6be36af18d13da13b0c326ea48f4b79)), closes [#75](https://github.com/stanvanrooy/instauto/issues/75)
* add example to post image with location data ([f06cc6b](https://github.com/stanvanrooy/instauto/commit/f06cc6bd0c6ea69663afea8497352f55235ccdff))
* remove python3.8 feature ([#77](https://github.com/stanvanrooy/instauto/issues/77)) ([3a85741](https://github.com/stanvanrooy/instauto/commit/3a85741f7432e9d1c32784ffd9b969e2c081f801)), closes [#74](https://github.com/stanvanrooy/instauto/issues/74)

### 0.0.16 (2020-10-07)


### Features

* add pprint to __repr__ ([ea8560e](https://github.com/stanvanrooy/instauto/commit/ea8560e6f2609883b66eff6b5993ec940f86bb36))
* handle verification challenges ([c684491](https://github.com/stanvanrooy/instauto/commit/c68449107887226caf1ca3eead8e110d7eb7c594)), closes [#49](https://github.com/stanvanrooy/instauto/issues/49) [#49](https://github.com/stanvanrooy/instauto/issues/49)


### Bug Fixes

* errors in GetFollowing/GetFollowers ([#57](https://github.com/stanvanrooy/instauto/issues/57)) ([6501651](https://github.com/stanvanrooy/instauto/commit/65016511764df691bdb327a7d1f1b8a6f2aaa083))
* give kwargs priority over defaults ([c55e193](https://github.com/stanvanrooy/instauto/commit/c55e1938bb5ff8199008e46bcc1c5564adcb5325))
* imports, usages of new structs. ([16ec0e8](https://github.com/stanvanrooy/instauto/commit/16ec0e86bcaa73ab3cd0e86b7cd33987a0405f25))
* incorrect key in `profile_info` ([436f833](https://github.com/stanvanrooy/instauto/commit/436f8336cf12b40f91c84637c724560e9825e1f3))
* sending location data along with upload request ([2cc6dbb](https://github.com/stanvanrooy/instauto/commit/2cc6dbb01cd968ba00279264a8c829ef5fcc97b0))
* temporarily disable testing ([ebb947f](https://github.com/stanvanrooy/instauto/commit/ebb947ff715acfd5e6abf5251aa7da7fca38f9b6))
* update return signature of `profile_info` ([a07580c](https://github.com/stanvanrooy/instauto/commit/a07580c3126acd95347e478e197e4e5290a62d9d))
