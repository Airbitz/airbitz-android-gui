/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.airbitz.api;

public final class tABC_AsyncEventType {
  public final static tABC_AsyncEventType ABC_AsyncEventType_IncomingBitCoin = new tABC_AsyncEventType("ABC_AsyncEventType_IncomingBitCoin");
  public final static tABC_AsyncEventType ABC_AsyncEventType_BlockHeightChange = new tABC_AsyncEventType("ABC_AsyncEventType_BlockHeightChange");
  public final static tABC_AsyncEventType ABC_AsyncEventType_DataSyncUpdate = new tABC_AsyncEventType("ABC_AsyncEventType_DataSyncUpdate");
  public final static tABC_AsyncEventType ABC_AsyncEventType_RemotePasswordChange = new tABC_AsyncEventType("ABC_AsyncEventType_RemotePasswordChange");
  public final static tABC_AsyncEventType ABC_AsyncEventType_IncomingSweep = new tABC_AsyncEventType("ABC_AsyncEventType_IncomingSweep");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static tABC_AsyncEventType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + tABC_AsyncEventType.class + " with value " + swigValue);
  }

  private tABC_AsyncEventType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private tABC_AsyncEventType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private tABC_AsyncEventType(String swigName, tABC_AsyncEventType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static tABC_AsyncEventType[] swigValues = { ABC_AsyncEventType_IncomingBitCoin, ABC_AsyncEventType_BlockHeightChange, ABC_AsyncEventType_DataSyncUpdate, ABC_AsyncEventType_RemotePasswordChange, ABC_AsyncEventType_IncomingSweep };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

