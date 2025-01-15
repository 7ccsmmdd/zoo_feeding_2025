/**
 */
package uk.ac.kcl.inf.mdd.zoo_lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Model#getAnimal <em>Animal</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.zoo_lang.Model#getFood <em>Food</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Animal</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.zoo_lang.Animal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animal</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getModel_Animal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animal> getAnimal();

	/**
	 * Returns the value of the '<em><b>Food</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.zoo_lang.Food}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.zoo_lang.Zoo_langPackage#getModel_Food()
	 * @model containment="true"
	 * @generated
	 */
	EList<Food> getFood();

} // Model
