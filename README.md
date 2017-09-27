# FedoraGenericSearch (GSearch)

See the text at [`FedoraGenericSearch/src/html/fedoragsearch-doc.html`](FedoraGenericSearch/src/html/fedoragsearch-doc.html)
or after installation at `http://localhost:8080/fedoragsearch`

## Building

Requires:
* Apache Ant

```
CURRENT_DIR=$PWD
git clone https://github.com/discoverygarden/gsearch.git
cd gsearch/FedoraGenericSearch
ant release
# The "ant release" call will build a .zip file in
# $CURRENT_DIR/gsearch/FgsBuild/release/fedoragsearch-{version}.zip
# where {version} is specified in
# $CURRENT_DIR/gsearch/FedoraGenericSearch/build.xml
# Alternatively, the war file itself will be in
# $CURRENT_DIR/gsearch/FgsBuild/fromsource/fedoragsearch.war
```

---

* License and Copyright: FedoraGenericSearch is subject to the same open source
license as the Fedora Commons Repository System at www.fedora-commons.org
* Copyright 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015 by The
Technical University of Denmark.
* All rights reserved.
