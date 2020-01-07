# Use this version with image built from this folder to startup 2 infinispan instances that replicates on localhost
docker run -p 11222:11222 -p 7200:7200 -it --entrypoint "/opt/infinispan/bin/server.sh" demoforum/infinispan-xsite:latest -b SITE_LOCAL \
    -Dapp.site=SITE1 -Djgroups.external.addr=docker.for.mac.localhost -Djgroups.initial.hosts=docker.for.mac.localhost[7200],docker.for.mac.localhost[17200]