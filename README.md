# odl-toasterapp
OpenDayLight Toaster Example
=============================
1) cd karaf 
2) download opendaylight-nitrogen SR2 version (git commit : 563574df48eadebcc30daa5bbb753564eadd5417 )
source code nitrogen sr2 https://github.com/opendaylight/controller/archive/release/nitrogen-sr2.zip
to get distribute-opendaylight-karaf , mvn clean install
3) after install successfully, cd karaf/target/ and unzip karaf-0.7.2.zip 
4) change .m2 repository location on odl-toasterapp/org.ops4j.pax.url.mvn.cfg
4) cp odl-toasterapp/org.ops4j.pax.url.mvn.cfg odl-toasterapp/karaf/target/karaf-0.7.2/etc/
5) cd odl-toasterapp
6) mvn clean install
7) run ODL-cli , odl-toasterapp/karaf/target/karaf-0.7.2/bin/karaf
8) feature:install odl-restconf-all
9) feature:install odl-mdsal-apidocs
10) install feature repo , 
       feature:repo-add mvn:com.quantum.toaster/quantum-toaster/1.6.2/xml/features
11) install feature ,  
       feature:install quantum-toaster
