/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage
 * @generated
 */
public interface Zoo_langFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Zoo_langFactory eINSTANCE = uk.ac.kcl.inf.mdd.zoo_lang.impl.Zoo_langFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animal</em>'.
	 * @generated
	 */
	Animal createAnimal();

	/**
	 * Returns a new object of class '<em>Needs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Needs</em>'.
	 * @generated
	 */
	Needs createNeeds();

	/**
	 * Returns a new object of class '<em>Food</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Food</em>'.
	 * @generated
	 */
	Food createFood();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Zoo_langPackage getZoo_langPackage();

} //Zoo_langFactory
