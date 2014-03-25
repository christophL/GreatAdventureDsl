/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage
 * @generated
 */
public interface GreatAdventureFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreatAdventureFactory eINSTANCE = at.ac.uibk.greatAdventure.greatAdventure.impl.GreatAdventureFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Adventure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adventure</em>'.
   * @generated
   */
  Adventure createAdventure();

  /**
   * Returns a new object of class '<em>Adventure Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adventure Title</em>'.
   * @generated
   */
  AdventureTitle createAdventureTitle();

  /**
   * Returns a new object of class '<em>Item Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Definition</em>'.
   * @generated
   */
  ItemDefinition createItemDefinition();

  /**
   * Returns a new object of class '<em>Use Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Definition</em>'.
   * @generated
   */
  UseDefinition createUseDefinition();

  /**
   * Returns a new object of class '<em>Scene Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scene Definition</em>'.
   * @generated
   */
  SceneDefinition createSceneDefinition();

  /**
   * Returns a new object of class '<em>Item Position Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Position Definition</em>'.
   * @generated
   */
  ItemPositionDefinition createItemPositionDefinition();

  /**
   * Returns a new object of class '<em>Start Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Definition</em>'.
   * @generated
   */
  StartDefinition createStartDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GreatAdventurePackage getGreatAdventurePackage();

} //GreatAdventureFactory
