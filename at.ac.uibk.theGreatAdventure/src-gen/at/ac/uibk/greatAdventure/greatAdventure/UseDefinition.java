/**
 */
package at.ac.uibk.greatAdventure.greatAdventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getReqs <em>Reqs</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getAdds <em>Adds</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getDels <em>Dels</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getText <em>Text</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getFollowScene <em>Follow Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition()
 * @model
 * @generated
 */
public interface UseDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Reqs</b></em>' reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reqs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reqs</em>' reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_Reqs()
   * @model
   * @generated
   */
  EList<ItemDefinition> getReqs();

  /**
   * Returns the value of the '<em><b>Alt Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt Text</em>' attribute list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_AltText()
   * @model unique="false"
   * @generated
   */
  EList<String> getAltText();

  /**
   * Returns the value of the '<em><b>Adds</b></em>' reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adds</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adds</em>' reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_Adds()
   * @model
   * @generated
   */
  EList<ItemDefinition> getAdds();

  /**
   * Returns the value of the '<em><b>Dels</b></em>' reference list.
   * The list contents are of type {@link at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dels</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dels</em>' reference list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_Dels()
   * @model
   * @generated
   */
  EList<ItemDefinition> getDels();

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute list.
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_Text()
   * @model unique="false"
   * @generated
   */
  EList<String> getText();

  /**
   * Returns the value of the '<em><b>Follow Scene</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Follow Scene</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Follow Scene</em>' reference.
   * @see #setFollowScene(SceneDefinition)
   * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage#getUseDefinition_FollowScene()
   * @model
   * @generated
   */
  SceneDefinition getFollowScene();

  /**
   * Sets the value of the '{@link at.ac.uibk.greatAdventure.greatAdventure.UseDefinition#getFollowScene <em>Follow Scene</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Follow Scene</em>' reference.
   * @see #getFollowScene()
   * @generated
   */
  void setFollowScene(SceneDefinition value);

} // UseDefinition
