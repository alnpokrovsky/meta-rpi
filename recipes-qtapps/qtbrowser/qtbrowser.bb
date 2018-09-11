SUMMARY = "Qt5 Quick Web browser application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# I want to make sure these get installed too.
DEPENDS += "qtbase qtdeclarative qtquickcontrols2 qtwebengine"

SRCREV = "${AUTOREV}"

SRC_URI = "file://*"

S = "${WORKDIR}"

require recipes-qt/qt5/qt5.inc

do_install() {
      install -d ${D}${bindir}
      install -m 0755 qtWebBrowser ${D}${bindir}

      install -d ${D}${sysconfdir}/init.d/
      install -m 0755 ${WORKDIR}/qtapp.init ${D}${sysconfdir}/init.d/qtapp-init
}


# autostart daemon
inherit update-rc.d
INITSCRIPT_NAME = "qtapp-init"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 19 0 1 6 ."
