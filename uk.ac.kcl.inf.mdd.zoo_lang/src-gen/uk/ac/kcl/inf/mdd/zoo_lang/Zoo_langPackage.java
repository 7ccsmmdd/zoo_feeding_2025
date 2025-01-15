/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang;

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
 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langFactory
 * @model kind="package"
 * @generated
 */
public interface Zoo_langPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zoo_lang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/zoo_lang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zoo_lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Zoo_langPackage eINSTANCE = uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Animal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ANIMAL = 0;

	/**
	 * The feature id for the '<em><b>Food</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FOOD = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.AnimalImpl
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 1;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NEEDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl <em>Needs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getNeeds()
	 * @generated
	 */
	int NEEDS = 2;

	/**
	 * The feature id for the '<em><b>Food</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS__FOOD = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Needs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Needs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEEDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.FoodImpl
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 3;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__NEEDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.zoo_lang.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.zoo_lang.Model#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animal</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Model#getAnimal()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Animal();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.zoo_lang.Model#getFood <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Food</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Model#getFood()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Food();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needs</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Animal#getNeeds()
	 * @see #getAnimal()
	 * @generated
	 */
	EReference getAnimal_Needs();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.zoo_lang.Animal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Animal#getName()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Needs</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Needs
	 * @generated
	 */
	EClass getNeeds();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getFood <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Food</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Needs#getFood()
	 * @see #getNeeds()
	 * @generated
	 */
	EReference getNeeds_Food();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.zoo_lang.Needs#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Needs#getQuantity()
	 * @see #getNeeds()
	 * @generated
	 */
	EAttribute getNeeds_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.zoo_lang.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.mdd.zoo_lang.Food#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needs</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Food#getNeeds()
	 * @see #getFood()
	 * @generated
	 */
	EReference getFood_Needs();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.zoo_lang.Food#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Food#getName()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Zoo_langFactory getZoo_langFactory();

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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.ModelImpl
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Animal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ANIMAL = eINSTANCE.getModel_Animal();

		/**
		 * The meta object literal for the '<em><b>Food</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FOOD = eINSTANCE.getModel_Food();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.AnimalImpl
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMAL__NEEDS = eINSTANCE.getAnimal_Needs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NAME = eINSTANCE.getAnimal_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl <em>Needs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.NeedsImpl
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getNeeds()
		 * @generated
		 */
		EClass NEEDS = eINSTANCE.getNeeds();

		/**
		 * The meta object literal for the '<em><b>Food</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEEDS__FOOD = eINSTANCE.getNeeds_Food();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEEDS__QUANTITY = eINSTANCE.getNeeds_Quantity();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.zoo_lang.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.FoodImpl
		 * @see uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOD__NEEDS = eINSTANCE.getFood_Needs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD__NAME = eINSTANCE.getFood_Name();

	}

} //Zoo_langPackage
