#!/usr/bin/env bash
javac -d out \
--module-source-path jug-istanbul/src/ \
$(find . -name "*.java")