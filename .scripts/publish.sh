#!/usr/bin/bash

set -e

# shellcheck disable=SC1090
source "$1"

mvn clean deploy
