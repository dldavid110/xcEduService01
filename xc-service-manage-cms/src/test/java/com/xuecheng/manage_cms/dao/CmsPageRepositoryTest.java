package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

//    @Test
//    public void testFindAll(){
//
//        List<CmsPage> all = cmsPageRepository.findAll();
//        System.out.print(all);
//    }



//    @Test
//    public void testFindPage() {
//
//        int page = 0;
//        int size = 10;
//        Pageable pageable  = PageRequest.of(page,size);
//        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
//        System.out.println(all);
//    }



//    //添加
//    @Test
//    public void testInsert(){
//        //定义实体类
//        CmsPage cmsPage = new CmsPage();
//        cmsPage.setSiteId("s01");
//        cmsPage.setTemplateId("t01");
//        cmsPage.setPageName("测试页面");
//        cmsPage.setPageCreateTime(new Date());
//        List<CmsPageParam> cmsPageParams = new ArrayList<>();
//        CmsPageParam cmsPageParam = new CmsPageParam();
//        cmsPageParam.setPageParamName("param1");
//        cmsPageParam.setPageParamValue("value1");
//        cmsPageParams.add(cmsPageParam);
//        cmsPage.setPageParams(cmsPageParams);
//        cmsPageRepository.save(cmsPage);
//        System.out.println(cmsPage);
//    }

//    //修改
//    @Test
//    public void testUpdate() {
//        Optional<CmsPage> optional = cmsPageRepository.findById("5e8ffd3db661623ba090abe3");
//        if(optional.isPresent()){
//        CmsPage cmsPage = optional.get();
//        cmsPage.setPageName("测试页面01");
//        cmsPage.setPageType("1");
//        cmsPageRepository.save(cmsPage);
//        }
//    }









    @Test
   //删除
    public void testDelete() {
        cmsPageRepository.deleteById("5e8ffd3db661623ba090abe3");
    }




   @Test
   public void testfindByPageNameAndPageType()
   {
       String pageName = "测试页面";
       String pageType = "1";
       CmsPage cmsPage = cmsPageRepository.findByPageNameAndPageType(pageName, pageType);
       System.out.println(cmsPage);
   }

    @Test
    public void testcountBySiteIdAndPageType()
    {
        String siteId = "s01";
        String pageType = "1";
        int count = cmsPageRepository.countBySiteIdAndPageType(siteId, pageType);
        System.out.println(count);
    }

    @Test
    public void testfindBySiteIdAndPageType()
    {
        String siteId = "s01";
        String pageType = "1";
        int page = 0;
        int size = 10;
        Pageable pageable  = PageRequest.of(page,size);

        Page<CmsPage> all = cmsPageRepository.findBySiteIdAndPageType(siteId, pageType, pageable);
        System.out.println(all);
    }












//    @Test
//   public void testfindByPageName()
//    {
//
//        CmsPage cmsPage = cmsPageRepository.findByPageName("测试页面");
//        System.out.println(cmsPage);
//    }



    // public void testConnection() {
////创建mongodb 客户端
    // MongoClient mongoClient = new MongoClient("localhost", 27017);
////或者采用连接字符串
////MongoClientURI connectionString = new   MongoClientURI("mongodb://root:root@localhost:27017");

////MongoClient mongoClient = new MongoClient(connectionString);
    // MongoDatabase database = mongoClient.getDatabase("test");
//// 连接collection
    // MongoCollection<org.bson.Document> collection = database.getCollection("student");
////查询第一个文档
    //  Document myDoc = collection.find().first();
    //  /* 得到文件内容 json串 */
    //  String json = myDoc.toJson();
    //   System.out.println(json);
    // }
}
