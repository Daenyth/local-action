#!/usr/bin/env python3

import requests


API_ROOT = "https://congress.api.sunlightfoundation.com/"


class SunlightApi:
    @staticmethod
    def url(endpoint: str) -> str:
        return API_ROOT + endpoint

    def locate_legislators(self, zipcode):
        resp = requests.get(self.url("legislators/locate"), params={'zip': zipcode})
        return resp
