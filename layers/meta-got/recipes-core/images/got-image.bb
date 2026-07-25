SUMMARY = "Got Project Linux image"
DESCRIPTION = "Image for Got project"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " got-app"