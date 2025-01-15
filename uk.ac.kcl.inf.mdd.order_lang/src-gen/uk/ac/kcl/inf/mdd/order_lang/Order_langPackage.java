/**
 */
package uk.ac.kcl.inf.mdd.order_lang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langFactory
 * @model kind="package"
 * @generated
 */
public interface Order_langPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "order_lang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/order_lang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "order_lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Order_langPackage eINSTANCE = uk.ac.kcl.inf.mdd.order_lang.impl.Order_langPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.order_lang.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.order_lang.impl.OrderImpl
	 * @see uk.ac.kcl.inf.mdd.order_lang.impl.Order_langPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 0;

	/**
	 * The feature id for the '<em><b>Orderlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDERLINES = 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.order_lang.impl.OrderLineImpl <em>Order Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.order_lang.impl.OrderLineImpl
	 * @see uk.ac.kcl.inf.mdd.order_lang.impl.Order_langPackageImpl#getOrderLine()
	 * @generated
	 */
	int ORDER_LINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Order Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.order_lang.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.order_lang.Order#getOrderlines <em>Orderlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderlines</em>'.
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order#getOrderlines()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Orderlines();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine <em>Order Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Line</em>'.
	 * @see uk.ac.kcl.inf.mdd.order_lang.OrderLine
	 * @generated
	 */
	EClass getOrderLine();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.order_lang.OrderLine#getName()
	 * @see #getOrderLine()
	 * @generated
	 */
	EAttribute getOrderLine_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.order_lang.OrderLine#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.kcl.inf.mdd.order_lang.OrderLine#getQuantity()
	 * @see #getOrderLine()
	 * @generated
	 */
	EAttribute getOrderLine_Quantity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Order_langFactory getOrder_langFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.order_lang.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.order_lang.impl.OrderImpl
		 * @see uk.ac.kcl.inf.mdd.order_lang.impl.Order_langPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Orderlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ORDERLINES = eINSTANCE.getOrder_Orderlines();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.order_lang.impl.OrderLineImpl <em>Order Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.order_lang.impl.OrderLineImpl
		 * @see uk.ac.kcl.inf.mdd.order_lang.impl.Order_langPackageImpl#getOrderLine()
		 * @generated
		 */
		EClass ORDER_LINE = eINSTANCE.getOrderLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE__NAME = eINSTANCE.getOrderLine_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE__QUANTITY = eINSTANCE.getOrderLine_Quantity();

	}

} //Order_langPackage
