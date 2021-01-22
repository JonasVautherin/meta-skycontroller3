DESCRIPTION = "Linux Kernel for SkyController 3"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "skycontroller3"

#inherit kernel
#inherit siteinfo
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-skycontroller3:"

KBUILD_DEFCONFIG = "msm8909_defconfig"
KCONFIG_MODE = "--alldefconfig"
