/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartLoc <em>Start Loc</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartItems <em>Start Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getStartDefinition()
 * @model
 * @generated
 */
public interface StartDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Start Loc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Loc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Loc</em>' reference.
   * @see #setStartLoc(SceneDefinition)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getStartDefinition_StartLoc()
   * @model
   * @generated
   */
  SceneDefinition getStartLoc();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.StartDefinition#getStartLoc <em>Start Loc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Loc</em>' reference.
   * @see #getStartLoc()
   * @generated
   */
  void setStartLoc(SceneDefinition value);

  /**
   * Returns the value of the '<em><b>Start Items</b></em>' reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Items</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Items</em>' reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getStartDefinition_StartItems()
   * @model
   * @generated
   */
  EList<ItemDefinition> getStartItems();

} // StartDefinition
