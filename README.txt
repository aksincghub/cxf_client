

in cxf_ws project, jetty must be running to support this application in development mode.


with server running...

	mvn clean package

will create all classes needed to call objects defined in the wsdl.


After generating client classes in package, you can develop the HumanResourceClient.main to
call wsdl object and then call 'mvn package' again.


The generated java is located in target/generated/cxf


to run
	mvn exec:java


