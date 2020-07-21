# odl-toasterapp
OpenDayLight Toaster Example
=============================
1) cd karaf 
2)  download latest opendaylight distribution from https://docs.opendaylight.org/en/stable-neon/downloads.html
wget https://nexus.opendaylight.org/content/repositories/public/org/opendaylight/integration/opendaylight/0.10.3/opendaylight-0.10.3.zip
3) unzip opendaylight-0.10.3.zip and cd opendaylight-0.10.3/etc
4) change .m2 repository location on org.ops4j.pax.url.mvn.cfg as below
   org.ops4j.pax.url.mvn.localRepository=${user.home}/.m2/repository
5) cd odl-toasterapp and copy settings.xml file into .m2 folder  
6) mvn clean install -DskipTests
7) run karaf-cli , odl-toasterapp/karaf/opendaylight-0.10.3/bin/karaf
8) feature:install odl-restconf-all
9) feature:install odl-mdsal-apidocs
10) install feature repo as below

       feature:repo-add mvn:com.quantum.toaster/quantum-toaster/1.6.2/xml/features
11) install feature ,  
       feature:install quantum-toaster
