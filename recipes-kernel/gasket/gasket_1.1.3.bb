#
# Copyright (c) Siemens AG, 2021
#
# Authors:
#  Jan Kiszka <jan.kiszka@siemens.com>
#
# This file is subject to the terms and conditions of the MIT License.  See
# COPYING.MIT file in the top-level directory.
#

require recipes-kernel/linux-module/module.inc

SRC_URI += "git://github.com/google/gasket-driver.git;protocol=https;branch=main"
SRCREV = "e1d5647f022bd44720057792966a47d0fbd86050"

S = "${WORKDIR}/git/src"

dpkg_runbuild_prepend() {
    export CONFIG_STAGING_GASKET_FRAMEWORK=m
    export CONFIG_STAGING_APEX_DRIVER=m
}
