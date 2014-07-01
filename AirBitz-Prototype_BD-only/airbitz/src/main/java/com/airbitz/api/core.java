/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.airbitz.api;

public class core implements coreConstants {
  public static SWIGTYPE_p_int new_intp() {
    long cPtr = coreJNI.new_intp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static SWIGTYPE_p_int copy_intp(int value) {
    long cPtr = coreJNI.copy_intp(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static void delete_intp(SWIGTYPE_p_int obj) {
    coreJNI.delete_intp(SWIGTYPE_p_int.getCPtr(obj));
  }

  public static void intp_assign(SWIGTYPE_p_int obj, int value) {
    coreJNI.intp_assign(SWIGTYPE_p_int.getCPtr(obj), value);
  }

  public static int intp_value(SWIGTYPE_p_int obj) {
    return coreJNI.intp_value(SWIGTYPE_p_int.getCPtr(obj));
  }

  public static SWIGTYPE_p_long new_longp() {
    long cPtr = coreJNI.new_longp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public static SWIGTYPE_p_long copy_longp(int value) {
    long cPtr = coreJNI.copy_longp(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public static void delete_longp(SWIGTYPE_p_long obj) {
    coreJNI.delete_longp(SWIGTYPE_p_long.getCPtr(obj));
  }

  public static void longp_assign(SWIGTYPE_p_long obj, int value) {
    coreJNI.longp_assign(SWIGTYPE_p_long.getCPtr(obj), value);
  }

  public static int longp_value(SWIGTYPE_p_long obj) {
    return coreJNI.longp_value(SWIGTYPE_p_long.getCPtr(obj));
  }

  public static SWIGTYPE_p_int64_t new_int64_tp() {
    long cPtr = coreJNI.new_int64_tp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_int64_t(cPtr, false);
  }

  public static SWIGTYPE_p_int64_t copy_int64_tp(SWIGTYPE_p_int64_t value) {
    long cPtr = coreJNI.copy_int64_tp(SWIGTYPE_p_int64_t.getCPtr(value));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int64_t(cPtr, false);
  }

  public static void delete_int64_tp(SWIGTYPE_p_int64_t obj) {
    coreJNI.delete_int64_tp(SWIGTYPE_p_int64_t.getCPtr(obj));
  }

  public static void int64_tp_assign(SWIGTYPE_p_int64_t obj, SWIGTYPE_p_int64_t value) {
    coreJNI.int64_tp_assign(SWIGTYPE_p_int64_t.getCPtr(obj), SWIGTYPE_p_int64_t.getCPtr(value));
  }

  public static SWIGTYPE_p_int64_t int64_tp_value(SWIGTYPE_p_int64_t obj) {
    return new SWIGTYPE_p_int64_t(coreJNI.int64_tp_value(SWIGTYPE_p_int64_t.getCPtr(obj)), true);
  }

  public static SWIGTYPE_p_double new_doublep() {
    long cPtr = coreJNI.new_doublep();
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static SWIGTYPE_p_double copy_doublep(double value) {
    long cPtr = coreJNI.copy_doublep(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void delete_doublep(SWIGTYPE_p_double obj) {
    coreJNI.delete_doublep(SWIGTYPE_p_double.getCPtr(obj));
  }

  public static void doublep_assign(SWIGTYPE_p_double obj, double value) {
    coreJNI.doublep_assign(SWIGTYPE_p_double.getCPtr(obj), value);
  }

  public static double doublep_value(SWIGTYPE_p_double obj) {
    return coreJNI.doublep_value(SWIGTYPE_p_double.getCPtr(obj));
  }

  public static tABC_CC ABC_Initialize(String szRootDir, SWIGTYPE_p_f_p_q_const__struct_sABC_AsyncBitCoinInfo__void fAsyncBitCoinEventCallback, SWIGTYPE_p_void pData, String pSeedData, long seedLength, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_Initialize(szRootDir, SWIGTYPE_p_f_p_q_const__struct_sABC_AsyncBitCoinInfo__void.getCPtr(fAsyncBitCoinEventCallback), SWIGTYPE_p_void.getCPtr(pData), pSeedData, seedLength, tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_Terminate() {
    coreJNI.ABC_Terminate();
  }

  public static tABC_CC ABC_ClearKeyCache(tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ClearKeyCache(tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_SignIn(String szUserName, String szPassword, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SignIn(szUserName, szPassword, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CreateAccount(String szUserName, String szPassword, String szPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CreateAccount(szUserName, szPassword, szPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_SetAccountRecoveryQuestions(String szUserName, String szPassword, String szRecoveryQuestions, String szRecoveryAnswers, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SetAccountRecoveryQuestions(szUserName, szPassword, szRecoveryQuestions, szRecoveryAnswers, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CreateWallet(String szUserName, String szPassword, String szWalletName, int currencyNum, long attributes, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CreateWallet(szUserName, szPassword, szWalletName, currencyNum, attributes, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetCurrencies(SWIGTYPE_p_p_sABC_Currency paCurrencyArray, SWIGTYPE_p_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetCurrencies(SWIGTYPE_p_p_sABC_Currency.getCPtr(paCurrencyArray), SWIGTYPE_p_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetPIN(String szUserName, String szPassword, SWIGTYPE_p_p_char pszPIN, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetPIN(szUserName, szPassword, SWIGTYPE_p_p_char.getCPtr(pszPIN), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_SetPIN(String szUserName, String szPassword, String szPIN, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SetPIN(szUserName, szPassword, szPIN, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetCategories(String szUserName, SWIGTYPE_p_p_p_char paszCategories, SWIGTYPE_p_unsigned_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetCategories(szUserName, SWIGTYPE_p_p_p_char.getCPtr(paszCategories), SWIGTYPE_p_unsigned_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_AddCategory(String szUserName, String szCategory, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_AddCategory(szUserName, szCategory, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_RemoveCategory(String szUserName, String szCategory, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_RemoveCategory(szUserName, szCategory, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_RenameWallet(String szUserName, String szPassword, String szUUID, String szNewWalletName, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_RenameWallet(szUserName, szPassword, szUUID, szNewWalletName, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_SetWalletAttributes(String szUserName, String szPassword, String szUUID, long attributes, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SetWalletAttributes(szUserName, szPassword, szUUID, attributes, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CheckRecoveryAnswers(String szUserName, String szRecoveryAnswers, SWIGTYPE_p_bool pbValid, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CheckRecoveryAnswers(szUserName, szRecoveryAnswers, SWIGTYPE_p_bool.getCPtr(pbValid), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetWalletInfo(String szUserName, String szPassword, String szUUID, SWIGTYPE_p_p_sABC_WalletInfo ppWalletInfo, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetWalletInfo(szUserName, szPassword, szUUID, SWIGTYPE_p_p_sABC_WalletInfo.getCPtr(ppWalletInfo), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeWalletInfo(tABC_WalletInfo pWalletInfo) {
    coreJNI.ABC_FreeWalletInfo(tABC_WalletInfo.getCPtr(pWalletInfo), pWalletInfo);
  }

  public static tABC_CC ABC_GetWallets(String szUserName, String szPassword, SWIGTYPE_p_p_p_sABC_WalletInfo paWalletInfo, SWIGTYPE_p_unsigned_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetWallets(szUserName, szPassword, SWIGTYPE_p_p_p_sABC_WalletInfo.getCPtr(paWalletInfo), SWIGTYPE_p_unsigned_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeWalletInfoArray(SWIGTYPE_p_p_sABC_WalletInfo aWalletInfo, long nCount) {
    coreJNI.ABC_FreeWalletInfoArray(SWIGTYPE_p_p_sABC_WalletInfo.getCPtr(aWalletInfo), nCount);
  }

  public static tABC_CC ABC_SetWalletOrder(String szUserName, String szPassword, SWIGTYPE_p_p_char aszUUIDArray, long countUUIDs, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SetWalletOrder(szUserName, szPassword, SWIGTYPE_p_p_char.getCPtr(aszUUIDArray), countUUIDs, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetQuestionChoices(String szUserName, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetQuestionChoices(szUserName, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeQuestionChoices(tABC_QuestionChoices pQuestionChoices) {
    coreJNI.ABC_FreeQuestionChoices(tABC_QuestionChoices.getCPtr(pQuestionChoices), pQuestionChoices);
  }

  public static tABC_CC ABC_GetRecoveryQuestions(String szUserName, SWIGTYPE_p_p_char pszQuestions, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetRecoveryQuestions(szUserName, SWIGTYPE_p_p_char.getCPtr(pszQuestions), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_ChangePassword(String szUserName, String szPassword, String szNewPassword, String szNewPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ChangePassword(szUserName, szPassword, szNewPassword, szNewPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_ChangePasswordWithRecoveryAnswers(String szUserName, String szRecoveryAnswers, String szNewPassword, String szNewPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ChangePasswordWithRecoveryAnswers(szUserName, szRecoveryAnswers, szNewPassword, szNewPIN, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_ParseBitcoinURI(String szURI, SWIGTYPE_p_p_sABC_BitcoinURIInfo ppInfo, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ParseBitcoinURI(szURI, SWIGTYPE_p_p_sABC_BitcoinURIInfo.getCPtr(ppInfo), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeURIInfo(tABC_BitcoinURIInfo pInfo) {
    coreJNI.ABC_FreeURIInfo(tABC_BitcoinURIInfo.getCPtr(pInfo), pInfo);
  }

  public static double ABC_SatoshiToBitcoin(SWIGTYPE_p_int64_t satoshi) {
    return coreJNI.ABC_SatoshiToBitcoin(SWIGTYPE_p_int64_t.getCPtr(satoshi));
  }

  public static SWIGTYPE_p_int64_t ABC_BitcoinToSatoshi(double bitcoin) {
    return new SWIGTYPE_p_int64_t(coreJNI.ABC_BitcoinToSatoshi(bitcoin), true);
  }

  public static tABC_CC ABC_SatoshiToCurrency(String szUserName, String szPassword, SWIGTYPE_p_int64_t satoshi, SWIGTYPE_p_double pCurrency, int currencyNum, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SatoshiToCurrency(szUserName, szPassword, SWIGTYPE_p_int64_t.getCPtr(satoshi), SWIGTYPE_p_double.getCPtr(pCurrency), currencyNum, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CurrencyToSatoshi(String szUserName, String szPassword, double currency, int currencyNum, SWIGTYPE_p_int64_t pSatoshi, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CurrencyToSatoshi(szUserName, szPassword, currency, currencyNum, SWIGTYPE_p_int64_t.getCPtr(pSatoshi), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_ParseAmount(String szAmount, SWIGTYPE_p_int64_t pAmountOut, long decimalPlaces) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ParseAmount(szAmount, SWIGTYPE_p_int64_t.getCPtr(pAmountOut), decimalPlaces));
  }

  public static tABC_CC ABC_FormatAmount(SWIGTYPE_p_int64_t amount, SWIGTYPE_p_p_char pszAmountOut, long decimalPlaces, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_FormatAmount(SWIGTYPE_p_int64_t.getCPtr(amount), SWIGTYPE_p_p_char.getCPtr(pszAmountOut), decimalPlaces, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CreateReceiveRequest(String szUserName, String szPassword, String szWalletUUID, tABC_TxDetails pDetails, SWIGTYPE_p_p_char pszRequestID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CreateReceiveRequest(szUserName, szPassword, szWalletUUID, tABC_TxDetails.getCPtr(pDetails), pDetails, SWIGTYPE_p_p_char.getCPtr(pszRequestID), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_ModifyReceiveRequest(String szUserName, String szPassword, String szWalletUUID, String szRequestID, tABC_TxDetails pDetails, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_ModifyReceiveRequest(szUserName, szPassword, szWalletUUID, szRequestID, tABC_TxDetails.getCPtr(pDetails), pDetails, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_FinalizeReceiveRequest(String szUserName, String szPassword, String szWalletUUID, String szRequestID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_FinalizeReceiveRequest(szUserName, szPassword, szWalletUUID, szRequestID, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CancelReceiveRequest(String szUserName, String szPassword, String szWalletUUID, String szRequestID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CancelReceiveRequest(szUserName, szPassword, szWalletUUID, szRequestID, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GenerateRequestQRCode(String szUserName, String szPassword, String szWalletUUID, String szRequestID, SWIGTYPE_p_p_unsigned_char paData, SWIGTYPE_p_unsigned_int pWidth, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GenerateRequestQRCode(szUserName, szPassword, szWalletUUID, szRequestID, SWIGTYPE_p_p_unsigned_char.getCPtr(paData), SWIGTYPE_p_unsigned_int.getCPtr(pWidth), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_InitiateSendRequest(String szUserName, String szPassword, String szWalletUUID, String szDestAddress, tABC_TxDetails pDetails, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void fRequestCallback, SWIGTYPE_p_void pData, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_InitiateSendRequest(szUserName, szPassword, szWalletUUID, szDestAddress, tABC_TxDetails.getCPtr(pDetails), pDetails, SWIGTYPE_p_f_p_q_const__struct_sABC_RequestResults__void.getCPtr(fRequestCallback), SWIGTYPE_p_void.getCPtr(pData), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_CalcSendFees(String szUserName, String szPassword, String szWalletUUID, String szDestAddress, tABC_TxDetails pDetails, SWIGTYPE_p_int64_t pTotalFees, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CalcSendFees(szUserName, szPassword, szWalletUUID, szDestAddress, tABC_TxDetails.getCPtr(pDetails), pDetails, SWIGTYPE_p_int64_t.getCPtr(pTotalFees), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetTransaction(String szUserName, String szPassword, String szWalletUUID, String szID, SWIGTYPE_p_p_sABC_TxInfo ppTransaction, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetTransaction(szUserName, szPassword, szWalletUUID, szID, SWIGTYPE_p_p_sABC_TxInfo.getCPtr(ppTransaction), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetTransactions(String szUserName, String szPassword, String szWalletUUID, SWIGTYPE_p_p_p_sABC_TxInfo paTransactions, SWIGTYPE_p_unsigned_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetTransactions(szUserName, szPassword, szWalletUUID, SWIGTYPE_p_p_p_sABC_TxInfo.getCPtr(paTransactions), SWIGTYPE_p_unsigned_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_SearchTransactions(String szUserName, String szPassword, String szWalletUUID, String szQuery, SWIGTYPE_p_p_p_sABC_TxInfo paTransactions, SWIGTYPE_p_unsigned_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SearchTransactions(szUserName, szPassword, szWalletUUID, szQuery, SWIGTYPE_p_p_p_sABC_TxInfo.getCPtr(paTransactions), SWIGTYPE_p_unsigned_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeTransaction(tABC_TxInfo pTransaction) {
    coreJNI.ABC_FreeTransaction(tABC_TxInfo.getCPtr(pTransaction), pTransaction);
  }

  public static void ABC_FreeTransactions(SWIGTYPE_p_p_sABC_TxInfo aTransactions, long count) {
    coreJNI.ABC_FreeTransactions(SWIGTYPE_p_p_sABC_TxInfo.getCPtr(aTransactions), count);
  }

  public static tABC_CC ABC_SetTransactionDetails(String szUserName, String szPassword, String szWalletUUID, String szID, tABC_TxDetails pDetails, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_SetTransactionDetails(szUserName, szPassword, szWalletUUID, szID, tABC_TxDetails.getCPtr(pDetails), pDetails, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetTransactionDetails(String szUserName, String szPassword, String szWalletUUID, String szID, SWIGTYPE_p_p_sABC_TxDetails ppDetails, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetTransactionDetails(szUserName, szPassword, szWalletUUID, szID, SWIGTYPE_p_p_sABC_TxDetails.getCPtr(ppDetails), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetRequestAddress(String szUserName, String szPassword, String szWalletUUID, String szRequestID, SWIGTYPE_p_p_char pszAddress, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetRequestAddress(szUserName, szPassword, szWalletUUID, szRequestID, SWIGTYPE_p_p_char.getCPtr(pszAddress), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_GetPendingRequests(String szUserName, String szPassword, String szWalletUUID, SWIGTYPE_p_p_p_sABC_RequestInfo paRequests, SWIGTYPE_p_unsigned_int pCount, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_GetPendingRequests(szUserName, szPassword, szWalletUUID, SWIGTYPE_p_p_p_sABC_RequestInfo.getCPtr(paRequests), SWIGTYPE_p_unsigned_int.getCPtr(pCount), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeRequests(SWIGTYPE_p_p_sABC_RequestInfo aRequests, long count) {
    coreJNI.ABC_FreeRequests(SWIGTYPE_p_p_sABC_RequestInfo.getCPtr(aRequests), count);
  }

  public static tABC_CC ABC_DuplicateTxDetails(SWIGTYPE_p_p_sABC_TxDetails ppNewDetails, tABC_TxDetails pOldDetails, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_DuplicateTxDetails(SWIGTYPE_p_p_sABC_TxDetails.getCPtr(ppNewDetails), tABC_TxDetails.getCPtr(pOldDetails), pOldDetails, tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeTxDetails(tABC_TxDetails pDetails) {
    coreJNI.ABC_FreeTxDetails(tABC_TxDetails.getCPtr(pDetails), pDetails);
  }

  public static tABC_CC ABC_CheckPassword(String szPassword, SWIGTYPE_p_double pSecondsToCrack, SWIGTYPE_p_p_p_sABC_PasswordRule paRules, SWIGTYPE_p_unsigned_int pCountRules, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_CheckPassword(szPassword, SWIGTYPE_p_double.getCPtr(pSecondsToCrack), SWIGTYPE_p_p_p_sABC_PasswordRule.getCPtr(paRules), SWIGTYPE_p_unsigned_int.getCPtr(pCountRules), tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreePasswordRuleArray(SWIGTYPE_p_p_sABC_PasswordRule aRules, long nCount) {
    coreJNI.ABC_FreePasswordRuleArray(SWIGTYPE_p_p_sABC_PasswordRule.getCPtr(aRules), nCount);
  }

  public static tABC_CC ABC_LoadAccountSettings(String szUserName, String szPassword, SWIGTYPE_p_p_sABC_AccountSettings ppSettings, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_LoadAccountSettings(szUserName, szPassword, SWIGTYPE_p_p_sABC_AccountSettings.getCPtr(ppSettings), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_UpdateAccountSettings(String szUserName, String szPassword, tABC_AccountSettings pSettings, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_UpdateAccountSettings(szUserName, szPassword, tABC_AccountSettings.getCPtr(pSettings), pSettings, tABC_Error.getCPtr(pError), pError));
  }

  public static void ABC_FreeAccountSettings(tABC_AccountSettings pSettings) {
    coreJNI.ABC_FreeAccountSettings(tABC_AccountSettings.getCPtr(pSettings), pSettings);
  }

  public static tABC_CC ABC_WatcherStart(String szUserName, String szPassword, String szWalletUUID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_WatcherStart(szUserName, szPassword, szWalletUUID, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_WatchAddresses(String szUsername, String szPassword, String szWalletUUID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_WatchAddresses(szUsername, szPassword, szWalletUUID, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_WatcherStop(String szWalletUUID, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_WatcherStop(szWalletUUID, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_WatcherRestart(String szUserName, String szPassword, String szWalletUUID, boolean clearCache, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_WatcherRestart(szUserName, szPassword, szWalletUUID, clearCache, tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_TxHeight(String szWalletUUID, String szTxId, SWIGTYPE_p_unsigned_int height, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_TxHeight(szWalletUUID, szTxId, SWIGTYPE_p_unsigned_int.getCPtr(height), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_BlockHeight(String szWalletUUID, SWIGTYPE_p_unsigned_int height, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_BlockHeight(szWalletUUID, SWIGTYPE_p_unsigned_int.getCPtr(height), tABC_Error.getCPtr(pError), pError));
  }

  public static tABC_CC ABC_RequestExchangeRateUpdate(String szUserName, String szPassword, int currencyNum, tABC_Error pError) {
    return tABC_CC.swigToEnum(coreJNI.ABC_RequestExchangeRateUpdate(szUserName, szPassword, currencyNum, tABC_Error.getCPtr(pError), pError));
  }

  public static SWIGTYPE_p_long p64_t_to_long_ptr(SWIGTYPE_p_int64_t x) {
    long cPtr = coreJNI.p64_t_to_long_ptr(SWIGTYPE_p_int64_t.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public static SWIGTYPE_p_double p64_t_to_double_ptr(SWIGTYPE_p_int64_t x) {
    long cPtr = coreJNI.p64_t_to_double_ptr(SWIGTYPE_p_int64_t.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_int int_to_uint(SWIGTYPE_p_int x) {
    long cPtr = coreJNI.int_to_uint(SWIGTYPE_p_int.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_WalletInfo longp_to_ppWalletinfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppWalletinfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_WalletInfo(cPtr, false);
  }

  public static tABC_WalletInfo longp_to_pWalletinfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_pWalletinfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new tABC_WalletInfo(cPtr, false);
  }

  public static SWIGTYPE_p_p_p_sABC_WalletInfo longp_to_pppWalletInfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_pppWalletInfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_p_sABC_WalletInfo(cPtr, false);
  }

  public static SWIGTYPE_p_p_p_sABC_TxInfo longp_to_pppTxInfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_pppTxInfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_p_sABC_TxInfo(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_TxInfo longp_to_ppTxInfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppTxInfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_TxInfo(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_Currency longp_to_ppCurrency(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppCurrency(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_Currency(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_TxDetails longp_to_ppTxDetails(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppTxDetails(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_TxDetails(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_AccountSettings longp_to_ppAccountSettings(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppAccountSettings(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_AccountSettings(cPtr, false);
  }

  public static SWIGTYPE_p_p_char longp_to_ppChar(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_ppChar(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public static SWIGTYPE_p_p_unsigned_char longp_to_unsigned_ppChar(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longp_to_unsigned_ppChar(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_unsigned_char(cPtr, false);
  }

  public static SWIGTYPE_p_long charpp_to_longp(SWIGTYPE_p_p_char x) {
    long cPtr = coreJNI.charpp_to_longp(SWIGTYPE_p_p_char.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public static SWIGTYPE_p_p_sABC_BitcoinURIInfo longPtr_to_ppBitcoinURIInfo(SWIGTYPE_p_long x) {
    long cPtr = coreJNI.longPtr_to_ppBitcoinURIInfo(SWIGTYPE_p_long.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_sABC_BitcoinURIInfo(cPtr, false);
  }

  public static SWIGTYPE_p_void requestResultsp_to_voidp(tABC_RequestResults x) {
    long cPtr = coreJNI.requestResultsp_to_voidp(tABC_RequestResults.getCPtr(x), x);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

}
