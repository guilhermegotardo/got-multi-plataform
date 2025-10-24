DESCRIPTION = "Fixed local Linux kernel for Raspberry Pi 3 (no git, no network)"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

COMPATIBLE_MACHINE ?= "^rpi$"

inherit kernel

FILESEXTRAPATHS:prepend := "${TOPDIR}/../sources/linux:"

SRC_URI = "file://linux-6.6.63"

S = "${WORKDIR}/linux-6.6.63"

KERNEL_IMAGETYPE = "Image"

KERNEL_DEFCONFIG = "got_rpi3_defconfig"

KERNEL_DEVICETREE += " \
    broadcom/bcm2710-rpi-3-b.dtb \
    broadcom/bcm2710-rpi-3-b-plus.dtb \
"

# KERNEL_MODULE_AUTOLOAD += "..."

PROVIDES += "virtual/kernel"
