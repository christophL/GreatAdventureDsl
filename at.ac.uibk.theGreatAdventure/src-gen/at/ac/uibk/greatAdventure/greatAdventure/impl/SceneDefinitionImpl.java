/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl#getImg <em>Img</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.SceneDefinitionImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneDefinitionImpl extends MinimalEObjectImpl.Container implements SceneDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected static final String IMG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected String img = IMG_EDEFAULT;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ItemPositionDefinition> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SceneDefinitionImpl()
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
    return GreatAdventurePackage.Literals.SCENE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.SCENE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImg()
  {
    return img;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImg(String newImg)
  {
    String oldImg = img;
    img = newImg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.SCENE_DEFINITION__IMG, oldImg, img));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemPositionDefinition> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ItemPositionDefinition>(ItemPositionDefinition.class, this, GreatAdventurePackage.SCENE_DEFINITION__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.SCENE_DEFINITION__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GreatAdventurePackage.SCENE_DEFINITION__NAME:
        return getName();
      case GreatAdventurePackage.SCENE_DEFINITION__IMG:
        return getImg();
      case GreatAdventurePackage.SCENE_DEFINITION__ITEMS:
        return getItems();
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
      case GreatAdventurePackage.SCENE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case GreatAdventurePackage.SCENE_DEFINITION__IMG:
        setImg((String)newValue);
        return;
      case GreatAdventurePackage.SCENE_DEFINITION__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ItemPositionDefinition>)newValue);
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
      case GreatAdventurePackage.SCENE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreatAdventurePackage.SCENE_DEFINITION__IMG:
        setImg(IMG_EDEFAULT);
        return;
      case GreatAdventurePackage.SCENE_DEFINITION__ITEMS:
        getItems().clear();
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
      case GreatAdventurePackage.SCENE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreatAdventurePackage.SCENE_DEFINITION__IMG:
        return IMG_EDEFAULT == null ? img != null : !IMG_EDEFAULT.equals(img);
      case GreatAdventurePackage.SCENE_DEFINITION__ITEMS:
        return items != null && !items.isEmpty();
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
    result.append(", img: ");
    result.append(img);
    result.append(')');
    return result.toString();
  }

} //SceneDefinitionImpl
