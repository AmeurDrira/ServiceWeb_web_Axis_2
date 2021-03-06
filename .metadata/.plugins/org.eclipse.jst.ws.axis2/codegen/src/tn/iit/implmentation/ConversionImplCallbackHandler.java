
/**
 * ConversionImplCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package tn.iit.implmentation;

    /**
     *  ConversionImplCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ConversionImplCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ConversionImplCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ConversionImplCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for convert method
            * override this method for handling normal response from convert operation
            */
           public void receiveResultconvert(
                    tn.iit.implmentation.ConversionImplStub.ConvertResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from convert operation
           */
            public void receiveErrorconvert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createBanque method
            * override this method for handling normal response from createBanque operation
            */
           public void receiveResultcreateBanque(
                    tn.iit.implmentation.ConversionImplStub.CreateBanqueResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createBanque operation
           */
            public void receiveErrorcreateBanque(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listBanque method
            * override this method for handling normal response from listBanque operation
            */
           public void receiveResultlistBanque(
                    tn.iit.implmentation.ConversionImplStub.ListBanqueResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listBanque operation
           */
            public void receiveErrorlistBanque(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listDevise method
            * override this method for handling normal response from listDevise operation
            */
           public void receiveResultlistDevise(
                    tn.iit.implmentation.ConversionImplStub.ListDeviseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listDevise operation
           */
            public void receiveErrorlistDevise(java.lang.Exception e) {
            }
                


    }
    