This layer provides the packages necessary to use the spice protocol with qemu

it is meant to be used with the meta-hype layer for virtualization

NOTE: I have found that this layer might not build correctly if you multithread the build process. There is an issue with some of the main spice-client package being added before some of its dependencies.

TODO: layer dependencies
