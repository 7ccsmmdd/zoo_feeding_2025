/**
 */
package uk.ac.kcl.inf.mdd.order_lang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage
 * @generated
 */
public interface Order_langFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Order_langFactory eINSTANCE = uk.ac.kcl.inf.mdd.order_lang.impl.Order_langFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Order Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Line</em>'.
	 * @generated
	 */
	OrderLine createOrderLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Order_langPackage getOrder_langPackage();

} //Order_langFactory
