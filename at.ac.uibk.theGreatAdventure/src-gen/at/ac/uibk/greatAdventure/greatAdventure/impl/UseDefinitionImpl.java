/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getReqs <em>Reqs</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getAltText <em>Alt Text</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getAdds <em>Adds</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getDels <em>Dels</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getText <em>Text</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.UseDefinitionImpl#getFollowScene <em>Follow Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseDefinitionImpl extends MinimalEObjectImpl.Container implements UseDefinition
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * The cached value of the '{@link #getReqs() <em>Reqs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqs()
   * @generated
   * @ordered
   */
  protected EList<ItemDefinition> reqs;

  /**
   * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltText()
   * @generated
   * @ordered
   */
  protected EList<String> altText;

  /**
   * The cached value of the '{@link #getAdds() <em>Adds</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdds()
   * @generated
   * @ordered
   */
  protected EList<ItemDefinition> adds;

  /**
   * The cached value of the '{@link #getDels() <em>Dels</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDels()
   * @generated
   * @ordered
   */
  protected EList<ItemDefinition> dels;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected EList<String> text;

  /**
   * The cached value of the '{@link #getFollowScene() <em>Follow Scene</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowScene()
   * @generated
   * @ordered
   */
  protected SceneDefinition followScene;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreatAdventurePackage.Literals.USE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, GreatAdventurePackage.USE_DEFINITION__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemDefinition> getReqs()
  {
    if (reqs == null)
    {
      reqs = new EObjectResolvingEList<ItemDefinition>(ItemDefinition.class, this, GreatAdventurePackage.USE_DEFINITION__REQS);
    }
    return reqs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAltText()
  {
    if (altText == null)
    {
      altText = new EDataTypeEList<String>(String.class, this, GreatAdventurePackage.USE_DEFINITION__ALT_TEXT);
    }
    return altText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemDefinition> getAdds()
  {
    if (adds == null)
    {
      adds = new EObjectResolvingEList<ItemDefinition>(ItemDefinition.class, this, GreatAdventurePackage.USE_DEFINITION__ADDS);
    }
    return adds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemDefinition> getDels()
  {
    if (dels == null)
    {
      dels = new EObjectResolvingEList<ItemDefinition>(ItemDefinition.class, this, GreatAdventurePackage.USE_DEFINITION__DELS);
    }
    return dels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getText()
  {
    if (text == null)
    {
      text = new EDataTypeEList<String>(String.class, this, GreatAdventurePackage.USE_DEFINITION__TEXT);
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDefinition getFollowScene()
  {
    if (followScene != null && followScene.eIsProxy())
    {
      InternalEObject oldFollowScene = (InternalEObject)followScene;
      followScene = (SceneDefinition)eResolveProxy(oldFollowScene);
      if (followScene != oldFollowScene)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE, oldFollowScene, followScene));
      }
    }
    return followScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDefinition basicGetFollowScene()
  {
    return followScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFollowScene(SceneDefinition newFollowScene)
  {
    SceneDefinition oldFollowScene = followScene;
    followScene = newFollowScene;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE, oldFollowScene, followScene));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.USE_DEFINITION__NAME:
        return getName();
      case GreatAdventurePackage.USE_DEFINITION__REQS:
        return getReqs();
      case GreatAdventurePackage.USE_DEFINITION__ALT_TEXT:
        return getAltText();
      case GreatAdventurePackage.USE_DEFINITION__ADDS:
        return getAdds();
      case GreatAdventurePackage.USE_DEFINITION__DELS:
        return getDels();
      case GreatAdventurePackage.USE_DEFINITION__TEXT:
        return getText();
      case GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE:
        if (resolve) return getFollowScene();
        return basicGetFollowScene();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.USE_DEFINITION__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__REQS:
        getReqs().clear();
        getReqs().addAll((Collection<? extends ItemDefinition>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__ALT_TEXT:
        getAltText().clear();
        getAltText().addAll((Collection<? extends String>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__ADDS:
        getAdds().clear();
        getAdds().addAll((Collection<? extends ItemDefinition>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__DELS:
        getDels().clear();
        getDels().addAll((Collection<? extends ItemDefinition>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends String>)newValue);
        return;
      case GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE:
        setFollowScene((SceneDefinition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.USE_DEFINITION__NAME:
        getName().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__REQS:
        getReqs().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__ALT_TEXT:
        getAltText().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__ADDS:
        getAdds().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__DELS:
        getDels().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__TEXT:
        getText().clear();
        return;
      case GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE:
        setFollowScene((SceneDefinition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.USE_DEFINITION__NAME:
        return name != null && !name.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__REQS:
        return reqs != null && !reqs.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__ALT_TEXT:
        return altText != null && !altText.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__ADDS:
        return adds != null && !adds.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__DELS:
        return dels != null && !dels.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__TEXT:
        return text != null && !text.isEmpty();
      case GreatAdventurePackage.USE_DEFINITION__FOLLOW_SCENE:
        return followScene != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", altText: ");
    result.append(altText);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //UseDefinitionImpl
