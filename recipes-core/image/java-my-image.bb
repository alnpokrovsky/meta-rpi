# Pulled from a mix of different images:
include recipes-core/images/core-image-base.bb

inherit core-image

SUMMARY = "The minimal image that can run java applications"
LICENSE = "MIT"


TOOLS = " \
    openjre-8 \
"

FEATURES = " \
    i2c-tools \
    python-smbus \
    bridge-utils \
    hostapd \
    dhcp-server \
    iptables \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-dejavu-sans \
    ttf-dejavu-sans-mono \
"

IMAGE_INSTALL_append = " \
    ${TOOLS} \
    ${FEATURES} \
    ${FONTS} \
    externaljava \
"

