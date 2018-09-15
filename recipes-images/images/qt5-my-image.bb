# Pulled from a mix of different images:
include recipes-core/images/core-image-base.bb

inherit core-image

SUMMARY = "The minimal image that can run Qt5 applications"
LICENSE = "MIT"

TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
"

PKGS = " \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtwebengine \
    qtwebengine-dev \
    qtwebengine-mkspecs \
"

FEATURES = " \
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
    ${PKGS} \
    ${FEATURES} \
    ${FONTS} \
    basicquick \
    qtbrowser \
"

PACKAGECONFIG_FONTS_append_pn-qtbase = "fontconfig"


