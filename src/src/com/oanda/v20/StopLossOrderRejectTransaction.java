package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A StopLossOrderRejectTransaction represents the rejection of the creation of
* a StopLoss Order.
*/

public class StopLossOrderRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public StopLossOrderRejectTransaction set_id(String __id) { 
        this._id = new TransactionID(__id); 
        return this;
    }
    /**
    * The Transaction's Identifier.
    */

    public String get_id() {
        return this._id.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public StopLossOrderRejectTransaction set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Transaction was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("userID") private Integer _userID;
    public StopLossOrderRejectTransaction set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The ID of the user that initiated the creation of the Transaction.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("accountID") private AccountID _accountID;
    public StopLossOrderRejectTransaction set_accountID(String __accountID) { 
        this._accountID = new AccountID(__accountID); 
        return this;
    }
    /**
    * The ID of the Account the Transaction was created for.
    */

    public String get_accountID() {
        return this._accountID.get_AccountID();
    }

    @SerializedName("batchID") private TransactionID _batchID;
    public StopLossOrderRejectTransaction set_batchID(String __batchID) { 
        this._batchID = new TransactionID(__batchID); 
        return this;
    }
    /**
    * The ID of the "batch" that the Transaction belongs to. Transactions in
    * the same batch are applied to the Account simultaneously.
    */

    public String get_batchID() {
        return this._batchID.get_TransactionID();
    }

    @SerializedName("requestID") private RequestID _requestID;
    public StopLossOrderRejectTransaction set_requestID(String __requestID) { 
        this._requestID = new RequestID(__requestID); 
        return this;
    }
    /**
    * The Request ID of the Account Control Request which generated the
    * transaction (only provided for Transactions created by a Client request)
    */

    public String get_requestID() {
        return this._requestID.get_RequestID();
    }

    @SerializedName("type") private TransactionType _type = TransactionType.STOP_LOSS_ORDER_REJECT;
    /**
    * The Type of the Transaction. Always set to "STOP_LOSS_ORDER_REJECT" in a
    * StopLossOrderRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public StopLossOrderRejectTransaction set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade to close when the price threshold is breached.
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("clientTradeID") private ClientID _clientTradeID;
    public StopLossOrderRejectTransaction set_clientTradeID(String __clientTradeID) { 
        this._clientTradeID = new ClientID(__clientTradeID); 
        return this;
    }
    /**
    * The client ID of the Trade to be closed when the price threshold is
    * breached.
    */

    public String get_clientTradeID() {
        return this._clientTradeID.get_ClientID();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public StopLossOrderRejectTransaction set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the StopLoss Order. The associated
    * Trade will be closed by a market price that is equal to or worse than
    * this threshold.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public StopLossOrderRejectTransaction set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
    * "GFD" and "GTD" for StopLoss Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public StopLossOrderRejectTransaction set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the StopLoss Order will be cancelled if its
    * timeInForce is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition _triggerCondition = OrderTriggerCondition.DEFAULT;
    public StopLossOrderRejectTransaction set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
        this._triggerCondition = __triggerCondition;
        return this;
    }
    /**
    * Specification of what component of a price should be used for comparison
    * when determining if the Order should be filled.
    */

    public OrderTriggerCondition get_triggerCondition() {
        return this._triggerCondition;
    }

    @SerializedName("reason") private StopLossOrderReason _reason;
    public StopLossOrderRejectTransaction set_reason(StopLossOrderReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Stop Loss Order was initiated
    */

    public StopLossOrderReason get_reason() {
        return this._reason;
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public StopLossOrderRejectTransaction set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Order (only provided if the Order is
    * being created with client extensions).
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }

    @SerializedName("orderFillTransactionID") private TransactionID _orderFillTransactionID;
    public StopLossOrderRejectTransaction set_orderFillTransactionID(String __orderFillTransactionID) { 
        this._orderFillTransactionID = new TransactionID(__orderFillTransactionID); 
        return this;
    }
    /**
    * The ID of the OrderFill Transaction that caused this Order to be created
    * (only provided if this Order was created automatically when another Order
    * was filled).
    */

    public String get_orderFillTransactionID() {
        return this._orderFillTransactionID.get_TransactionID();
    }

    @SerializedName("intendedReplacesOrderID") private OrderID _intendedReplacesOrderID;
    public StopLossOrderRejectTransaction set_intendedReplacesOrderID(String __intendedReplacesOrderID) { 
        this._intendedReplacesOrderID = new OrderID(__intendedReplacesOrderID); 
        return this;
    }
    /**
    * The ID of the Order that this Order was intended to replace (only
    * provided if this Order was intended to replace an existing Order).
    */

    public String get_intendedReplacesOrderID() {
        return this._intendedReplacesOrderID.get_OrderID();
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public StopLossOrderRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
        this._rejectReason = __rejectReason;
        return this;
    }
    /**
    * The reason that the Reject Transaction was created
    */

    public TransactionRejectReason get_rejectReason() {
        return this._rejectReason;
    }
}