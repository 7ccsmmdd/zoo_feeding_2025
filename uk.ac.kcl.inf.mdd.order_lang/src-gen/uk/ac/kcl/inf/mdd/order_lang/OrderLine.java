/**
 */
package uk.ac.kcl.inf.mdd.order_lang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#getOrderLine()
 * @model
 * @generated
 */
public interface OrderLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#getOrderLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#getOrderLine_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // OrderLine
