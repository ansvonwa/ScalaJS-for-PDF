#!/bin/bash

cd scala
sbt reload compile fastOptJS

cd ../latex
pdflatex -shell-escape document.tex
pdflatex -shell-escape document.tex

