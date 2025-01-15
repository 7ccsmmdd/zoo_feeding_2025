/**
 */
package uk.ac.kcl.inf.mdd.order_lang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.mdd.order_lang.Order;
import uk.ac.kcl.inf.mdd.order_lang.OrderLine;
import uk.ac.kcl.inf.mdd.order_lang.Order_langFactory;
import uk.ac.kcl.inf.mdd.order_lang.Order_langPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Order_langPackageImpl extends EPackageImpl implements Order_langPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderLineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.kcl.inf.mdd.order_lang.Order_langPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Order_langPackageImpl() {
		super(eNS_URI, Order_langFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Order_langPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Order_langPackage init() {
		if (isInited)
			return (Order_langPackage) EPackage.Registry.INSTANCE.getEPackage(Order_langPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrder_langPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Order_langPackageImpl theOrder_langPackage = registeredOrder_langPackage instanceof Order_langPackageImpl
				? (Order_langPackageImpl) registeredOrder_langPackage
				: new Order_langPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOrder_langPackage.createPackageContents();

		// Initialize created meta-data
		theOrder_langPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrder_langPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Order_langPackage.eNS_URI, theOrder_langPackage);
		return theOrder_langPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_Orderlines() {
		return (EReference) orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderLine() {
		return orderLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderLine_Name() {
		return (EAttribute) orderLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderLine_Quantity() {
		return (EAttribute) orderLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order_langFactory getOrder_langFactory() {
		return (Order_langFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__ORDERLINES);

		orderLineEClass = createEClass(ORDER_LINE);
		createEAttribute(orderLineEClass, ORDER_LINE__NAME);
		createEAttribute(orderLineEClass, ORDER_LINE__QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Orderlines(), this.getOrderLine(), null, "orderlines", null, 0, -1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderLineEClass, OrderLine.class, "OrderLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderLine_Name(), ecorePackage.getEString(), "name", null, 0, 1, OrderLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderLine_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, OrderLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Order_langPackageImpl
