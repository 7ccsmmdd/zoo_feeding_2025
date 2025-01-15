/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdd.zoo_lang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Zoo_langFactoryImpl extends EFactoryImpl implements Zoo_langFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Zoo_langFactory init() {
		try {
			Zoo_langFactory theZoo_langFactory = (Zoo_langFactory) EPackage.Registry.INSTANCE
					.getEFactory(Zoo_langPackage.eNS_URI);
			if (theZoo_langFactory != null) {
				return theZoo_langFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Zoo_langFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zoo_langFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Zoo_langPackage.MODEL:
			return createModel();
		case Zoo_langPackage.ANIMAL:
			return createAnimal();
		case Zoo_langPackage.NEEDS:
			return createNeeds();
		case Zoo_langPackage.FOOD:
			return createFood();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Animal createAnimal() {
		AnimalImpl animal = new AnimalImpl();
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Needs createNeeds() {
		NeedsImpl needs = new NeedsImpl();
		return needs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Food createFood() {
		FoodImpl food = new FoodImpl();
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zoo_langPackage getZoo_langPackage() {
		return (Zoo_langPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Zoo_langPackage getPackage() {
		return Zoo_langPackage.eINSTANCE;
	}

} //Zoo_langFactoryImpl
