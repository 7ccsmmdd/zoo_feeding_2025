/**
 */
package uk.ac.kcl.inf.mdd.order_lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.order_lang.Order#getOrderlines <em>Orderlines</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Orderlines</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.order_lang.OrderLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderlines</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#getOrder_Orderlines()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderLine> getOrderlines();

} // Order
