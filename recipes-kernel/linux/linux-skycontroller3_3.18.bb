LINUX_VERSION ?= "3.18.31"

require linux-skycontroller3.inc

SRC_URI += "https://github.com/parrot-opensource/skycontroller3-opensource/archive/1.5.1.zip;name=sources"
SRC_URI += "file://Kconfig.patch"
SRC_URI += "file://log2.h.patch"
SRC_URI += "file://uaccess.h.patch"
SRC_URI += "file://android.c.patch"
SRC_URI += "file://devicetree.patch"

SRC_URI[sources.sha256sum] = "b2b25440fecc095076259d7ebfbee7853e60448e0214afd1d7070d0dd9080e76"

S = "${WORKDIR}/skycontroller3-opensource-1.5.1/sources/linux-3.18.31/linux-3.18.31"

PV = "${LINUX_VERSION}"
