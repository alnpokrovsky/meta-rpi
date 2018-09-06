SUMMARY = "Simple Java application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# I want to make sure these get installed too.
RDEPENDS_${PN} = "java2-runtime"

SRCREV = "${AUTOREV}"
SRC_URI = "file://Hello.java"

S = "${WORKDIR}"

inherit java-library

do_compile() {
	mkdir -p build
	javac -d build `find . -name "*.java"`
	fastjar cf ${JARFILENAME} -C build .
}

BBCLASSEXTEND = "native"

#do_install() {
#      install -d ${D}${bindir}
#      install -m 0755 BasicQuick ${D}${bindir}
#}

