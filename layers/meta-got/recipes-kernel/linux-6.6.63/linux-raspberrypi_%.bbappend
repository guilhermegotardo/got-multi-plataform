FILESEXTRAPATHS:prepend := "${TOPDIR}/../sources/linux:"

SRC_URI = " \
    file://linux-6.6.63 \
    file://kernel-meta;type=kmeta;name=meta;destsuffix=kernel-meta \
    file://powersave.cfg \
    file://android-drivers.cfg \
"

KMETA = "kernel-meta"

KERNEL_CONFIG_FRAGMENTS += " \
    ${WORKDIR}/powersave.cfg \
    ${WORKDIR}/android-drivers.cfg \
"

S = "${WORKDIR}/linux/linux-6.6.63"

KERNEL_DEFCONFIG = "bcmrpi3_defconfig"

