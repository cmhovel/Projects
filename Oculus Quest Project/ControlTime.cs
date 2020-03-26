using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ControlTime : MonoBehaviour
{
    public OVRCameraRig head;
    Vector3 prevHead, prevLeft, prevRight;

    public float affectedTimeScale = 1.0f;

    public const float MIN_SCALE = .1f;
    public const float CapVelocity = .1f;

    public GameObject leftHand, rightHand;

    // Start is called before the first frame update
    void Start()
    {
        SetPrevState();
    }

    // Update is called once per frame
    void Update()
    {

    }

    private void FixedUpdate()
    {
        Vector3 headVel = head.transform.position - prevHead;
        Vector3 leftVel = OVRInput.GetLocalControllerPosition(OVRInput.Controller.LTouch) - prevLeft;
        Vector3 rightVel = OVRInput.GetLocalControllerPosition(OVRInput.Controller.RTouch) - prevRight;

        float totalVel = 1.5f * headVel.magnitude + .8f * leftVel.magnitude + .8f * rightVel.magnitude;

        affectedTimeScale = (totalVel / CapVelocity) + MIN_SCALE;

        Time.timeScale = affectedTimeScale;
        Time.fixedDeltaTime = 0.01111111f * Time.timeScale;
        return;
        leftHand.transform.position = gameObject.transform.Find("TrackingSpace").transform.TransformPoint(OVRInput.GetLocalControllerPosition(OVRInput.Controller.LTouch));
        rightHand.transform.position = gameObject.transform.Find("TrackingSpace").transform.TransformPoint(OVRInput.GetLocalControllerPosition(OVRInput.Controller.RTouch));
    }

    private void LateUpdate()
    {
        SetPrevState();
    }

    void SetPrevState()
    {
        prevHead = head.transform.position;
        prevLeft = OVRInput.GetLocalControllerPosition(OVRInput.Controller.LTouch);
        prevRight = OVRInput.GetLocalControllerPosition(OVRInput.Controller.RTouch);
    }
}
