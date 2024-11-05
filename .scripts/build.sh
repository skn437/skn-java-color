#!/usr/bin/bash

set -e

# shellcheck disable=SC1090
source "$1"

mvn clean package

if test -d .apidocs; then
  rm -rf .apidocs
  printf "Old '.apidocs' directory deleted successfully! 👍 \n"
fi

if test -d ./target/apidocs; then
  cp -r ./target/apidocs ./.apidocs
fi
