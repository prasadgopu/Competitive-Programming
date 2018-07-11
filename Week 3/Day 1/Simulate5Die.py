import random

def rand7():
    """return a random integer from 1 to 7"""
    return random.randrange(1, 8)


def rand5():
    """return a random integer from 1 to 5"""
    while True:
        r = rand7()
        if r < 6:
            return r


def rand5natural():
    """return a random integer from 1 to 5"""
    return random.randrange(1, 6)