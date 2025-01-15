/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.mdd.zoo_lang.Food;
import uk.ac.kcl.inf.mdd.zoo_lang.Needs;
import uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Needs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl#getFood <em>Food</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedsImpl extends MinimalEObjectImpl.Container implements Needs {
	/**
	 * The cached value of the '{@link #getFood() <em>Food</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood()
	 * @generated
	 * @ordered
	 */
	protected Food food;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zoo_langPackage.Literals.NEEDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Food getFood() {
		if (food != null && food.eIsProxy()) {
			InternalEObject oldFood = (InternalEObject) food;
			food = (Food) eResolveProxy(oldFood);
			if (food != oldFood) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Zoo_langPackage.NEEDS__FOOD, oldFood,
							food));
			}
		}
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Food basicGetFood() {
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFood(Food newFood, NotificationChain msgs) {
		Food oldFood = food;
		food = newFood;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Zoo_langPackage.NEEDS__FOOD,
					oldFood, newFood);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFood(Food newFood) {
		if (newFood != food) {
			NotificationChain msgs = null;
			if (food != null)
				msgs = ((InternalEObject) food).eInverseRemove(this, Zoo_langPackage.FOOD__NEEDS, Food.class, msgs);
			if (newFood != null)
				msgs = ((InternalEObject) newFood).eInverseAdd(this, Zoo_langPackage.FOOD__NEEDS, Food.class, msgs);
			msgs = basicSetFood(newFood, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zoo_langPackage.NEEDS__FOOD, newFood, newFood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Zoo_langPackage.NEEDS__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Zoo_langPackage.NEEDS__FOOD:
			if (food != null)
				msgs = ((InternalEObject) food).eInverseRemove(this, Zoo_langPackage.FOOD__NEEDS, Food.class, msgs);
			return basicSetFood((Food) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Zoo_langPackage.NEEDS__FOOD:
			return basicSetFood(null, msgs);
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
		case Zoo_langPackage.NEEDS__FOOD:
			if (resolve)
				return getFood();
			return basicGetFood();
		case Zoo_langPackage.NEEDS__QUANTITY:
			return getQuantity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Zoo_langPackage.NEEDS__FOOD:
			setFood((Food) newValue);
			return;
		case Zoo_langPackage.NEEDS__QUANTITY:
			setQuantity((Integer) newValue);
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
		case Zoo_langPackage.NEEDS__FOOD:
			setFood((Food) null);
			return;
		case Zoo_langPackage.NEEDS__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
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
		case Zoo_langPackage.NEEDS__FOOD:
			return food != null;
		case Zoo_langPackage.NEEDS__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //NeedsImpl
