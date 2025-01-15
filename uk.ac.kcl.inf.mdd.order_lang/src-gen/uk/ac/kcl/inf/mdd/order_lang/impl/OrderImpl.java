/**
 */
package uk.ac.kcl.inf.mdd.order_lang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.order_lang.Order;
import uk.ac.kcl.inf.mdd.order_lang.OrderLine;
import uk.ac.kcl.inf.mdd.order_lang.Order_langPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.order_lang.impl.OrderImpl#getOrderlines <em>Orderlines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The cached value of the '{@link #getOrderlines() <em>Orderlines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderlines()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderLine> orderlines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Order_langPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderLine> getOrderlines() {
		if (orderlines == null) {
			orderlines = new EObjectContainmentEList<OrderLine>(OrderLine.class, this,
					Order_langPackage.ORDER__ORDERLINES);
		}
		return orderlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Order_langPackage.ORDER__ORDERLINES:
			return ((InternalEList<?>) getOrderlines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Order_langPackage.ORDER__ORDERLINES:
			return getOrderlines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Order_langPackage.ORDER__ORDERLINES:
			getOrderlines().clear();
			getOrderlines().addAll((Collection<? extends OrderLine>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Order_langPackage.ORDER__ORDERLINES:
			getOrderlines().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Order_langPackage.ORDER__ORDERLINES:
			return orderlines != null && !orderlines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderImpl
