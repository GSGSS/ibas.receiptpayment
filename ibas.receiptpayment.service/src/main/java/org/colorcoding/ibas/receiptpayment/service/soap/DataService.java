package org.colorcoding.ibas.receiptpayment.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.colorcoding.ibas.bobas.common.Criteria;
import org.colorcoding.ibas.bobas.common.OperationResult;
import org.colorcoding.ibas.bobas.cxf.WebServicePath;
import org.colorcoding.ibas.receiptpayment.bo.assetrecharge.AssetRecharge;
import org.colorcoding.ibas.receiptpayment.bo.payment.Payment;
import org.colorcoding.ibas.receiptpayment.bo.receipt.Receipt;
import org.colorcoding.ibas.receiptpayment.repository.BORepositoryReceiptPayment;

/**
 * ReceiptPayment 数据服务JSON
 */
@WebService
@WebServicePath("data")
public class DataService extends BORepositoryReceiptPayment {

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-付款
	 * 
	 * @param criteria
	 *            查询
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Payment> fetchPayment(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchPayment(criteria, token);
	}

	/**
	 * 保存-付款
	 * 
	 * @param bo
	 *            对象实例
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Payment> savePayment(@WebParam(name = "bo") Payment bo,
			@WebParam(name = "token") String token) {
		return super.savePayment(bo, token);
	}

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-收款
	 * 
	 * @param criteria
	 *            查询
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Receipt> fetchReceipt(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchReceipt(criteria, token);
	}

	/**
	 * 保存-收款
	 * 
	 * @param bo
	 *            对象实例
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<Receipt> saveReceipt(@WebParam(name = "bo") Receipt bo,
			@WebParam(name = "token") String token) {
		return super.saveReceipt(bo, token);
	}

	// --------------------------------------------------------------------------------------------//
	/**
	 * 查询-资产充值
	 * 
	 * @param criteria
	 *            查询
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<AssetRecharge> fetchAssetRecharge(@WebParam(name = "criteria") Criteria criteria,
			@WebParam(name = "token") String token) {
		return super.fetchAssetRecharge(criteria, token);
	}

	/**
	 * 保存-资产充值
	 * 
	 * @param bo
	 *            对象实例
	 * @param token
	 *            口令
	 * @return 操作结果
	 */
	@WebMethod
	public OperationResult<AssetRecharge> saveAssetRecharge(@WebParam(name = "bo") AssetRecharge bo,
			@WebParam(name = "token") String token) {
		return super.saveAssetRecharge(bo, token);
	}
	// --------------------------------------------------------------------------------------------//

}
