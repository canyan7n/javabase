package com.canyan7n.jb.imgRecognition;

/**
 * @projectName: javabase
 * @package: com.canyan7n.jb.imgRecognition
 * @className: demo
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/19 11:34
 * @version: 1.0
 */
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.MatVector;
import org.bytedeco.opencv.opencv_core.Size;
import org.bytedeco.opencv.opencv_objdetect.CascadeClassifier;
import org.bytedeco.opencv.global.opencv_core;
import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.global.opencv_imgproc;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.leptonica.global.lept;
import org.bytedeco.leptonica.PIX;
//import org.bytedeco.leptonica.Pix;
import org.bytedeco.tesseract.*;
public class demo {

    public static void main(String[] args) {
        // 加载OpenCV库
        Loader.load(opencv_core.class);

        // 读取图像
        Mat image = opencv_imgcodecs.imread("C:\\Users\\15408\\Desktop\\1.png");

        // 创建一个灰度图像副本
        Mat grayImage = new Mat();
        opencv_imgproc.cvtColor(image, grayImage, opencv_imgproc.COLOR_BGR2GRAY);

        // 创建一个级联分类器并加载预训练模型
        CascadeClassifier faceDetector = new CascadeClassifier();
        faceDetector.load("path/to/your/haar_cascade.xml");

        // 在图像中检测对象
        MatVector faces = new MatVector();
        //faceDetector.detectMultiScale(grayImage, faces);

        // 遍历检测到的对象
        for (int i = 0; i < faces.size(); i++) {
            //opencv_core.Rect face = faces.get(i);

            // 绘制矩形框在图像中显示对象
//            opencv_imgproc.rectangle(
//                    image,
//                    face.tl(),
//                    face.br(),
//                    opencv_core.Scalar.RED,
//                    2,
//                    opencv_core.LINE_AA,
//                    0);
        }

        // 显示识别结果
        opencv_imgcodecs.imwrite("path/to/your/output_image.jpg", image);
    }
}


