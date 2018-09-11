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
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
    qtwebengine-dev \
    qtwebengine-mkspecs \
    qtwebengine \
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
    ${PKGS} \
    ${FEATURES} \
    ${FONTS} \
    basicquick \
    qtbrowser \
"

PACKAGECONFIG_FONTS_append_pn-qtbase = "fontconfig"


