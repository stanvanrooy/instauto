class StateExpired(Exception):
    """Raised when saved settings are provided, but not valid anymore"""
    pass


class NoAuthDetailsProvided(Exception):
    """Raised when the login details are not provided, but the client needs them"""
    pass


class WrongMethodException(Exception):
    """Raised when a wrong method is used."""
    pass
