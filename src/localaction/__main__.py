# coding: utf-8

from __future__ import absolute_import, division, print_function, unicode_literals

import sys

from . import SunlightApi

if __name__ == '__main__':
    api = SunlightApi()
    print(api.locate_legislators(sys.argv[1]))
