#!/bin/sh
# This hook script (a pre-commit hook script, to be precise) is executed BEFORE commiting changes.
# It will automatically include missing license headers before committing. To make this script work,
# make sure your current work directory is the root directory of the project, and execute
#   $ cp scripts/pre-commit.sh .git/hooks
./gradlew licenseFormat
