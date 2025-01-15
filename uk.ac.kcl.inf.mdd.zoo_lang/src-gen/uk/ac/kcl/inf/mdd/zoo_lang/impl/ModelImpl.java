/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.zoo_lang.Animal;
import uk.ac.kcl.inf.mdd.zoo_lang.Food;
import uk.ac.kcl.inf.mdd.zoo_lang.Model;
import uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl#getFood <em>Food</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected EList<Animal> animal;

	/**
	 * The cached value of the '{@link #getFood() <em>Food</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood()
	 * @generated
	 * @ordered
	 */
	protected EList<Food> food;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Zoo_langPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Animal> getAnimal() {
		if (animal == null) {
			animal = new EObjectContainmentEList<Animal>(Animal.class, this, Zoo_langPackage.MODEL__ANIMAL);
		}
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Food> getFood() {
		if (food == null) {
			food = new EObjectContainmentEList<Food>(Food.class, this, Zoo_langPackage.MODEL__FOOD);
		}
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Zoo_langPackage.MODEL__ANIMAL:
			return ((InternalEList<?>) getAnimal()).basicRemove(otherEnd, msgs);
		case Zoo_langPackage.MODEL__FOOD:
			return ((InternalEList<?>) getFood()).basicRemove(otherEnd, msgs);
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
		case Zoo_langPackage.MODEL__ANIMAL:
			return getAnimal();
		case Zoo_langPackage.MODEL__FOOD:
			return getFood();
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
		case Zoo_langPackage.MODEL__ANIMAL:
			getAnimal().clear();
			getAnimal().addAll((Collection<? extends Animal>) newValue);
			return;
		case Zoo_langPackage.MODEL__FOOD:
			getFood().clear();
			getFood().addAll((Collection<? extends Food>) newValue);
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
		case Zoo_langPackage.MODEL__ANIMAL:
			getAnimal().clear();
			return;
		case Zoo_langPackage.MODEL__FOOD:
			getFood().clear();
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
		case Zoo_langPackage.MODEL__ANIMAL:
			return animal != null && !animal.isEmpty();
		case Zoo_langPackage.MODEL__FOOD:
			return food != null && !food.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
