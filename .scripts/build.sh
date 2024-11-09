#!/usr/bin/bash

set -e

# shellcheck disable=SC1090
source "$1"

mvn clean package

JAVADOC_OUTPUT=".apidocs"

delete_directory "$JAVADOC_OUTPUT"

JAVADOC_LOCATION="./target/reports/apidocs"

copy_directory "$JAVADOC_LOCATION" "./$JAVADOC_OUTPUT"
